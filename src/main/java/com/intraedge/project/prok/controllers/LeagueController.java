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
import com.intraedge.project.prok.utilities.Utility;

@RestController
@RequestMapping(Utility.apiVersion + "leagues")
public class LeagueController {
	
	@Autowired
	private LeagueService leagueService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<League> getLeagues(){
		List<League> leagues = leagueService.getLeagues();
		return leagues;
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.GET)
	public League getLeagueBy_id(@PathVariable("_id") String _id) {
		return leagueService.findLeagueBy_id(_id);
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.PATCH)
	public League modifyLeagueBy_id(@PathVariable("_id") String _id, @Valid @RequestBody League league) {
		league.set_id(_id);
		leagueService.updateLeagueBy_id(league);
		return league;
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public League createLeague(@Valid @RequestBody League newLeague) {
//		league.set_id(ObjectId.get().toHexString());
//		System.out.println("league");
//		System.out.println(league);
		League createdLeague = leagueService.createLeague(newLeague);
		return createdLeague;
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> deleteLeague(@PathVariable String _id) {
//		System.out.println("controller delete league before service call");
		leagueService.deleteLeagueBy_id(_id);
//		System.out.println("controller delete league after service call");
		return new ResponseEntity<String>("League with ID: '"+ _id +"' was deleted", HttpStatus.OK);
	}

}
