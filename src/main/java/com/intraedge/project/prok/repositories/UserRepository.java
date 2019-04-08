package com.intraedge.project.prok.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domains.User;

public interface UserRepository  extends MongoRepository<User, String> {
	User findUserBy_id(String _id);
	User findUserByUsername(String username);
	User findUserByUserRole(String userRole);
	
	User getUserBy_id(String _id);
	User getUserByUsername(String username);
	User getUserByUserRole(String userRole);
}
