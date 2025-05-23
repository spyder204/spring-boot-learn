package com.example.StartSuit.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	
	@Secured({"ROLE_ADMIN"}) 
	//using Secured , simpler than @PreAuthorize
	
	@GetMapping("/admin")
	public String adminDashboard() {
		return "admin";
	}

}
