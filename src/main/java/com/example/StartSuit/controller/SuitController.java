package com.example.StartSuit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StartSuit.model.Suit;
import com.example.StartSuit.repository.SuitRepository;

@RestController
@RequestMapping("/api/suits")
public class SuitController {
	
	@Autowired
	private SuitRepository suitRepository;
	
	@PostMapping("/addSuits")
	public Suit CreateSuit(@RequestBody Suit suit) {
		return suitRepository.save(suit);
	}
	
	@GetMapping
	 public List<Suit> getAllSuits() {
        return suitRepository.findAll();
	}

}
