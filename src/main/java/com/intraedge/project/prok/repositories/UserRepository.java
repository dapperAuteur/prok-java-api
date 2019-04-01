package com.intraedge.project.prok.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domain.User;

public interface UserRepository  extends MongoRepository<User, String> {
	User findBy_id(ObjectId _id);
}
