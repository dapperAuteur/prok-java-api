package com.intraedge.project.prok.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.intraedge.project.prok.domains.User;


@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		// TODO Auto-generated method stub
		return User.class.equals(aClass);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		User user = (User)object;
		if(user.getPassword().length() < 5) {
			errors.rejectValue("password", "Length", "Password must be at least 5 characters");
		}
		
		if(!user.getPassword().contentEquals(user.getConfirmPassword())) {
			errors.rejectValue("password", "Match", "Password must match ConfirmPassword");
		}
	}

}
