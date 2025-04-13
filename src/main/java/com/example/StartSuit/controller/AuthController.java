package com.example.StartSuit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.StartSuit.dto.RegisterDto;
import com.example.StartSuit.service.UserService;

import org.springframework.ui.Model;

@Controller
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
	@Autowired
	private UserService userService;

	// Show the registration form
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		logger.info("register page ----");
		model.addAttribute("user", new RegisterDto());
		//here we are adding a blank object (user) to the model (Spring MVC)
		// adding a register object which helps to pass data 
		// from the view to the backend safely without exposing the user entity
		
		// binds form data to RegisterDto
		return "register"; // return Thymeleaf view i.e. register.html
	}

	// Handle form submission
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") RegisterDto userDto) {
		userService.registerNewUser(userDto); 
		// call service to save user
		return "redirect:/login?registered=true"; // redirect to login page with success flag
	}

}

/*
 * register page - > DTO -> user service - takes data from dto, saves in DB
 * authController - calls userService's save method
 * 
 * */

