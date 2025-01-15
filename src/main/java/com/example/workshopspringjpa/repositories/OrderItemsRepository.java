package com.example.workshopspringjpa.repositories;

import com.example.workshopspringjpa.entities.OrderItems;
import com.example.workshopspringjpa.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItems, OrderItemPK> {
}
