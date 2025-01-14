package com.example.workshopspringjpa.repositories;

import com.example.workshopspringjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
