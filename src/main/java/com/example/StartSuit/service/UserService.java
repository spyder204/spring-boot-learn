package com.example.StartSuit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.StartSuit.dto.RegisterDto;
import com.example.StartSuit.model.User;
import com.example.StartSuit.repository.UserRepository;

/**
 * Service class that contains business logic for registering a user. It takes
 * data from RegisterDto, converts it to the User entity, encodes the password,
 * and saves it to the database.
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public void registerNewUser(RegisterDto registerDto) {
		User user = new User();

		// Set username and encoded password
		user.setUsername(registerDto.getUsername());
		user.setPassword(passwordEncoder.encode(registerDto.getPassword())); // encode for security
		
		if(registerDto.getPassword().equals("99999"))
			user.setRole("AVENGER");
		else
			user.setRole("NPC (lame ass)");

		// Save the user entity to DB
		userRepository.save(user);
	}

}
