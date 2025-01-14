package com.example.workshopspringjpa.resources;

import com.example.workshopspringjpa.entities.Product;
import com.example.workshopspringjpa.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResources {

    @Autowired
    private ProductServices services;

    @GetMapping()
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = services.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = services.findById(id);
        return ResponseEntity.ok().body(product);

    }

}
