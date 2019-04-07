package com.intraedge.project.prok.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intraedge.project.prok.domain.User;
import com.intraedge.project.prok.services.UserService;
import com.intraedge.project.prok.utilities.Utility;

@RestController
@RequestMapping(Utility.apiVersion + "users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<User> getUsers(){
		List<User> users = userService.getUsers();
		return users;
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.GET)
	public User getUserBy_id(@PathVariable("_id") String _id) {
		return userService.findUserBy_id(_id);
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.PATCH)
	public User modifyLeagueBy_id(@PathVariable("_id") String _id, @Valid @RequestBody User user) {
		user.set_id(_id);
		userService.updateUserBy_id(user);
		return user;
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public User createUser(@Valid @RequestBody User newUser) {
		User createdUser = userService.createUser(newUser);
		return createdUser;
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> deleteUser(@PathVariable String _id){
		userService.deleteUserBy_id(_id);
		return new ResponseEntity<String>("User with ID: '"+ _id + "' was deleted", HttpStatus.OK);
	}

}
