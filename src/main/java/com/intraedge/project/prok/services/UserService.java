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
	
	public User findUserBy_id(String _id) {
		User foundUser = userRepository.findUserBy_id(_id);
		return foundUser;
	}
	
	public User createUser(User newUser) {
		User createdUser = userRepository.save(newUser);
		return createdUser;
	}
	
	public User updateUserBy_id(User user) {
		User updatedUser = userRepository.save(user);
		return updatedUser;
	}
	
	public void deleteUserBy_id(String _id) {
		User foundUser = userRepository.findUserBy_id(_id);
		userRepository.delete(foundUser);
	}

}
