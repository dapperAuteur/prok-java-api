package com.intraedge.project.prok.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intraedge.project.prok.domain.User;
import com.intraedge.project.prok.services.AuthService;
import com.intraedge.project.prok.services.MapValidationErrorService;
import com.intraedge.project.prok.services.UserService;
import com.intraedge.project.prok.utilities.Utility;

@RestController
@RequestMapping(Utility.apiVersion + "auth")
public class AuthController {
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@Autowired
	AuthService authService;
	
	@PostMapping("/sign-up")
	public ResponseEntity<?> signUp(@Valid @RequestBody User newUser, BindingResult result){
		
		ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
		if(errorMap != null) return errorMap;
		
		User createdUser = authService.createUser(newUser);
		
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}

}
