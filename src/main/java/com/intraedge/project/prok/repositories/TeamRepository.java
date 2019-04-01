package com.intraedge.project.prok.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domain.Team;

public interface TeamRepository  extends MongoRepository<Team, String> {
	Team findBy_id(ObjectId _id);
}
