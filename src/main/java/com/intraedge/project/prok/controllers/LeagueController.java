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

import com.intraedge.project.prok.domain.League;
import com.intraedge.project.prok.services.LeagueService;

@RestController
//@RequestMapping("/leagues")
public class LeagueController {
	
	@Autowired
	private LeagueService leagueService;
	
	@RequestMapping(value="/leagues", method=RequestMethod.GET)
	public List<League> getLeagues(){
		List<League> leagues = leagueService.getLeagues();
		return leagues;
	}
	
	@RequestMapping(value="/leagues/{id}", method=RequestMethod.GET)
	public League getLeagueBy_id(@PathVariable("id") String _id) {
		return leagueService.findLeagueBy_id(_id);
	}
	
	@RequestMapping(value="/leagues/{id}", method=RequestMethod.PUT)
	public League modifyLeagueBy_id(@PathVariable("id") String _id, @Valid @RequestBody League league) {
		league.set_id(_id);
		leagueService.updateLeagueBy_id(league);
		return league;
	}
	
	@RequestMapping(value="/leagues", method=RequestMethod.POST)
	public League createLeague(@Valid @RequestBody League league) {
//		league.set_id(ObjectId.get());
		leagueService.createLeague(league);
		return league;
	}
	
	@RequestMapping(value="/leagues/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> deleteLeague(@PathVariable String _id) {
		leagueService.deleteLeagueBy_id(_id);
		return new ResponseEntity<String>("League with ID: '"+ _id +"' was deleted", HttpStatus.OK);
	}

}
