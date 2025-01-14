package com.example.workshopspringjpa.config;

import com.example.workshopspringjpa.entities.User;
import com.example.workshopspringjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "admin", "admin@admin.com", "12345678901", "12345678");
        User u2 = new User(null, "mario", "mario@admin.com", "0987654321", "876543210");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
