package com.intraedge.project.prok.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domain.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {
	Player findBy_id(ObjectId _id);
}
