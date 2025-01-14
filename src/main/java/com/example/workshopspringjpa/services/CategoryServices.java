package com.example.workshopspringjpa.services;

import com.example.workshopspringjpa.entities.Category;
import com.example.workshopspringjpa.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(int id) {
        return repository.findById(id).get();
    }
}
