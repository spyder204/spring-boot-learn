package com.example.StartSuit.dto;

/**
 * DTO stands for Data Transfer Object.
 * Purpose: It helps transfer data from the registration form to the backend (service layer),
 * without exposing the full User entity (best practice).
 */

public class RegisterDto {
		
		private String username;
	    private String password;
	   // private String role;

	    // Getters and setters are required for form binding with Thymeleaf
	    public String getUsername() { return username; }
	    public void setUsername(String username) { this.username = username; }

	    public String getPassword() { return password; }
	    public void setPassword(String password) { this.password = password; }

	    //public String getRole() { return role; }
	   // public void setRole(String role) { this.role = role; }
}
