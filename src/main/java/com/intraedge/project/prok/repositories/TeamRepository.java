package com.intraedge.project.prok.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domains.Team;

public interface TeamRepository  extends MongoRepository<Team, String> {
	Team findTeamBy_id(String _id);
}
