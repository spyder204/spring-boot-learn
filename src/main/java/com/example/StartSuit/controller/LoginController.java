package com.example.StartSuit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	// shows login page

	@GetMapping("/login")
    public String loginPage() {
    	logger.info("login page ----");
        return "login";
    }

    // protected page shown after login
    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
    
}
