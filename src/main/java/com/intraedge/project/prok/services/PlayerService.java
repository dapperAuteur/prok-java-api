package com.intraedge.project.prok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domain.Player;
import com.intraedge.project.prok.repositories.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	public List<Player> getPlayers(){
		List<Player> foundPlayers = playerRepository.findAll();
		return foundPlayers;
	}
	
	public Player findPlayerBy_id(String _id) {
		Player foundPlayer = playerRepository.findPlayerBy_id(_id);
		return foundPlayer;
	}
}
