package com.example.workshopspringjpa.config;

import com.example.workshopspringjpa.entities.Order;
import com.example.workshopspringjpa.entities.User;
import com.example.workshopspringjpa.entities.enums.OrderStatus;
import com.example.workshopspringjpa.repositories.OrderRepository;
import com.example.workshopspringjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "admin", "admin@admin.com", "12345678901", "12345678");
        User u2 = new User(null, "mario", "mario@admin.com", "0987654321", "876543210");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order ord1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order ord2 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u2);
        Order ord3 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELED, u1);

        orderRepository.saveAll(Arrays.asList(ord1, ord2, ord3));


    }
}
