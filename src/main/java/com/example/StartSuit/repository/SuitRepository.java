package com.example.StartSuit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StartSuit.model.Suit;

@Repository
public interface SuitRepository extends JpaRepository<Suit, Long> {

}
