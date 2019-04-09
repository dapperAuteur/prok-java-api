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

import com.intraedge.project.prok.domains.User;
import com.intraedge.project.prok.services.AuthService;
import com.intraedge.project.prok.services.MapValidationErrorService;
import com.intraedge.project.prok.utilities.Utility;
import com.intraedge.project.prok.validators.UserValidator;

@RestController
@RequestMapping(Utility.API_VERSION + "auth")
public class AuthController {
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private UserValidator userValidator;
	
	@PostMapping("/sign-up")
	public ResponseEntity<?> signUp(@Valid @RequestBody User newUser, BindingResult result){
		
		userValidator.validate(newUser, result);
		
		ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
		if(errorMap != null) return errorMap;
		
		User createdUser = authService.createUser(newUser);
		
		return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
	}

}
