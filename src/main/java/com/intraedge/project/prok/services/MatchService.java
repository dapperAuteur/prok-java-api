package com.intraedge.project.prok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domain.Match;
import com.intraedge.project.prok.repositories.MatchRepository;

@Service
public class MatchService {
	
	@Autowired
	private MatchRepository matchRepository;
	
	public List<Match> getMatches(){
		List<Match> foundMatches = matchRepository.findAll();
		return foundMatches;
	}
	
	public Match findMatchBy_id(String _id) {
		Match matchFound = matchRepository.findMatchBy_id(_id);
		return matchFound;
	}
	
	public Match createMatch(Match newMatch) {
		Match createdMatch = matchRepository.save(newMatch);
		return createdMatch;
	}
	
	public Match updateMatchBy_id(Match match) {
		Match updatedMatch = matchRepository.save(match);
		return updatedMatch;
	}
	
	public void deleteMatchBy_id(String _id) {
		Match foundMatch = matchRepository.findMatchBy_id(_id);
		matchRepository.delete(foundMatch);
	}
}
