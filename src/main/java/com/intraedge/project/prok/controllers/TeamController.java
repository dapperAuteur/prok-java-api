package com.intraedge.project.prok.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intraedge.project.prok.domain.Team;
import com.intraedge.project.prok.services.TeamService;
import com.intraedge.project.prok.utilities.Utility;

@RestController
@RequestMapping(Utility.apiVersion + "teams")
public class TeamController {

	@Autowired
	private TeamService teamService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Team> getTeams() {
		List<Team> teams = teamService.getTeams();
		return teams;
	}

	@RequestMapping(value = "/{_id}", method = RequestMethod.GET)
	public Team getTeamBy_id(@PathVariable("_id") String _id) {
		return teamService.findTeamBy_id(_id);
	}

	@RequestMapping(value = "/{_id}", method = RequestMethod.PATCH)
	public Team modifyTeamBy_id(@PathVariable("_id") String _id, @Valid @RequestBody Team team) {
		team.set_id(_id);
		teamService.updateTeamBy_id(team);
		return team;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Team createTeam(@Valid @RequestBody Team newTeam) {
		Team createdTeam = teamService.createTeam(newTeam);
		return createdTeam;
	}

	@RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteTeam(@PathVariable String _id) {
		teamService.deleteTeamBy_id(_id);
		return new ResponseEntity<String>("Team with ID: '" + _id + "' was deleted", HttpStatus.OK);
	}
}
