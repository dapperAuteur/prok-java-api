package com.intraedge.project.prok.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domain.User;
import com.intraedge.project.prok.repositories.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public User createUser(User newUser) {
		
//		try {
//			
//		} catch (Exception e) {
//			throw new UserIdException
//		}
		
		newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
		User createdUser = userRepository.save(newUser);
		return createdUser;
	}

}
