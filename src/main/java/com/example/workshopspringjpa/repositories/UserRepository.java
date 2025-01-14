package com.example.workshopspringjpa.repositories;

import com.example.workshopspringjpa.entities.User;
import com.example.workshopspringjpa.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {




}
