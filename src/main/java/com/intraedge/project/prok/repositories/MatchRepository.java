package com.intraedge.project.prok.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domain.Match;

public interface MatchRepository  extends MongoRepository<Match, String> {
	Match findBy_id(ObjectId _id);
}
