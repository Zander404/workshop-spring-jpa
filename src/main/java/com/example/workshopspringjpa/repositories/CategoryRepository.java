package com.example.workshopspringjpa.repositories;

import com.example.workshopspringjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {

}
