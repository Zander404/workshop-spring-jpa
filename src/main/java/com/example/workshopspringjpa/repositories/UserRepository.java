package com.example.workshopspringjpa.repositories;

import com.example.workshopspringjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
