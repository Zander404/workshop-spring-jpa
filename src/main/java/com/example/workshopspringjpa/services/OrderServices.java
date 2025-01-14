package com.example.workshopspringjpa.services;

import com.example.workshopspringjpa.entities.Order;
import com.example.workshopspringjpa.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServices {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();

    }

    public Order findById(Long id){
        return repository.findById(id).get();
    }
}
