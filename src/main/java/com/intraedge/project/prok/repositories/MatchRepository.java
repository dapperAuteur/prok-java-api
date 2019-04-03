package com.intraedge.project.prok.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domain.Match;

public interface MatchRepository  extends MongoRepository<Match, String> {
	Match findMatchBy_id(String _id);
}
