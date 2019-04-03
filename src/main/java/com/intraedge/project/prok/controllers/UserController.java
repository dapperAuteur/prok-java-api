package com.intraedge.project.prok.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intraedge.project.prok.domain.User;
import com.intraedge.project.prok.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<User> getUsers(){
		List<User> users = userService.getUsers();
		return users;
	}

}
