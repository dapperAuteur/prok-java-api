package com.intraedge.project.prok.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intraedge.project.prok.domains.User;
import com.intraedge.project.prok.repositories.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.findUserByUsername(username);
		if(user == null) new UsernameNotFoundException("User NOT found.");
		return user;
	}
	
	@Transactional
	public User loadUserBy_id(String _id) {
		User user = userRepository.getUserBy_id(_id);
		if(user == null) new UsernameNotFoundException("User NOT found");
		return user;
	}
	
	

}
