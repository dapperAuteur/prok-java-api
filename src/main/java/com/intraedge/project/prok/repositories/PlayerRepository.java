package com.intraedge.project.prok.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domains.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {
	Player findPlayerBy_id(String _id);
}
