package com.example.workshopspringjpa.repositories;

import com.example.workshopspringjpa.entities.Product;
import com.example.workshopspringjpa.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface ProductRepository  extends JpaRepository<Product, Long> {


}
