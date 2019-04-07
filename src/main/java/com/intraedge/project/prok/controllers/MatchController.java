package com.intraedge.project.prok.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intraedge.project.prok.domain.Match;
import com.intraedge.project.prok.services.MatchService;
import com.intraedge.project.prok.utilities.Utility;

@RestController
@RequestMapping(Utility.apiVersion + "matches")
public class MatchController {
	
	@Autowired
	private MatchService matchService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Match> getMatches(){
		List<Match> matches = matchService.getMatches();
		return matches;
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.GET)
	public Match getMatchBy_id(@PathVariable("_id") String _id) {
		return matchService.findMatchBy_id(_id);
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.PATCH)
	public Match modifyMatchBy_id(@PathVariable("_id") String _id, @Valid @RequestBody Match match) {
		match.set_id(_id);
		matchService.updateMatchBy_id(match);
		return match;
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Match createMatch(@Valid @RequestBody Match newMatch) {
		Match createdMatch = matchService.createMatch(newMatch);
		return createdMatch;
	}
	
	@RequestMapping(value="/{_id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> deleteMatchBy_id(@PathVariable String _id){
		matchService.deleteMatchBy_id(_id);
		return new ResponseEntity<String>("Match with ID: '"+ _id +"' was deleted", HttpStatus.OK);
	}

}
