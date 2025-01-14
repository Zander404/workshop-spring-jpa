package com.example.workshopspringjpa.resources;

import com.example.workshopspringjpa.entities.Order;
import com.example.workshopspringjpa.repositories.OrderRepository;
import com.example.workshopspringjpa.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

    @Autowired
    private OrderServices services;

    @GetMapping()
    public ResponseEntity<List<Order>> findAll() {
        List<Order> orders = services.findAll();
        return ResponseEntity.ok().body(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order order = services.findById(id);
        return ResponseEntity.ok().body(order);
    }
}
