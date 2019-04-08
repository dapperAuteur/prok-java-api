package com.intraedge.project.prok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domains.Team;
import com.intraedge.project.prok.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public List<Team> getTeams() {
		List<Team> foundTeams = teamRepository.findAll();
		return foundTeams;
	}

	public Team findTeamBy_id(String _id) {
		Team foundTeam = teamRepository.findTeamBy_id(_id);
		return foundTeam;
	}

	public Team createTeam(Team newTeam) {
		Team createdTeam = teamRepository.save(newTeam);
		return createdTeam;
	}

	public Team updateTeamBy_id(Team team) {
		Team updatedTeam = teamRepository.save(team);
		return updatedTeam;
	}

	public void deleteTeamBy_id(String _id) {
		Team foundTeam = teamRepository.findTeamBy_id(_id);
		teamRepository.delete(foundTeam);
	}
}
