package com.example.StartSuit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StartSuit.model.User;

public interface UserRepository extends JpaRepository <User, String> {
    Optional<User> findByUsername(String username);
}
