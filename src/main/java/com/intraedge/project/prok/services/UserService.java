package com.intraedge.project.prok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domain.User;
import com.intraedge.project.prok.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers(){
		List<User> users = userRepository.findAll();
		return users;
	}

}
