package com.example.workshopspringjpa.resources;

import com.example.workshopspringjpa.entities.Category;
import com.example.workshopspringjpa.services.CategoryServices;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryResources {

    @Autowired
    private CategoryServices service;

    @GetMapping()
    public ResponseEntity<List<Category>> getAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getById(@PathVariable int id) {
        Category category = service.findById(id);
        return ResponseEntity.ok().body(category);
    }
}
