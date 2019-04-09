package com.intraedge.project.prok.security;

import java.util.Date;

import org.springframework.security.core.Authentication;

import com.intraedge.project.prok.domains.User;
import com.intraedge.project.prok.utilities.Utility;

public class SessionProvider {
	
	public String generateSession(Authentication authentication) {
		User user = (User)authentication.getPrincipal();
		
		Date now = new Date(System.currentTimeMillis());
		
		Date maxAge = new Date(now.getTime() + Utility.MAX_AGE);
		
		String userId = user.get_id();
		
		return null;
	}

}
