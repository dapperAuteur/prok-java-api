package com.intraedge.project.prok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domains.League;
import com.intraedge.project.prok.repositories.LeagueRepository;

@Service
public class LeagueService {

	@Autowired
	private LeagueRepository leagueRepository;

	public List<League> getLeagues() {
		List<League> foundLeagues = leagueRepository.findAll();
		return foundLeagues;
	}

	public League findLeagueBy_id(String _id) {
		League foundLeague = leagueRepository.findBy_id(_id);
		return foundLeague;
	}

	public League createLeague(League newLeague) {
		// System.out.println("before service createdLeague");
		League createdLeague = leagueRepository.save(newLeague);
		// System.out.println("createdLeague");
		// System.out.println(createdLeague);
		return createdLeague;
	}

	public League updateLeagueBy_id(League league) {
		League updatedLeague = leagueRepository.save(league);
		return updatedLeague;
	}

	public void deleteLeagueBy_id(String _id) {
		// System.out.println("service delete league before service call");
		League foundLeague = leagueRepository.findBy_id(_id);
		// System.out.println("service delete league after service call");
		leagueRepository.delete(foundLeague);
	}

}
