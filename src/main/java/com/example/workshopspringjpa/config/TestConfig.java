package com.example.workshopspringjpa.config;

import com.example.workshopspringjpa.entities.*;
import com.example.workshopspringjpa.entities.enums.OrderStatus;
import com.example.workshopspringjpa.repositories.CategoryRepository;
import com.example.workshopspringjpa.repositories.OrderRepository;
import com.example.workshopspringjpa.repositories.ProductRepository;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Category c1 = new Category(null, "Eletronics");
        Category c2 = new Category(null, "Books");
        Category c3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User u1 = new User(null, "admin", "admin@admin.com", "12345678901", "12345678");
        User u2 = new User(null, "mario", "mario@admin.com", "0987654321", "876543210");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order ord1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order ord2 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED, u2);
        Order ord3 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELED, u1);

        orderRepository.saveAll(Arrays.asList(ord1, ord2, ord3));

        Payment pay1 = new Payment(null, Instant.parse("2019-06-20T19:53:07Z"), ord1);

        ord1.setPayment(pay1);

        orderRepository.save(ord1);


    }
}
