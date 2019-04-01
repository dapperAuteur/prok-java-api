package com.intraedge.project.prok.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domain.League;

public interface LeagueRepository extends MongoRepository<League, String> {
	League findBy_id(ObjectId _id);

}
