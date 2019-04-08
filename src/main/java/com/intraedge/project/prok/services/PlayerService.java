package com.intraedge.project.prok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domains.Player;
import com.intraedge.project.prok.repositories.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public List<Player> getPlayers() {
		List<Player> foundPlayers = playerRepository.findAll();
		return foundPlayers;
	}

	public Player findPlayerBy_id(String _id) {
		Player foundPlayer = playerRepository.findPlayerBy_id(_id);
		return foundPlayer;
	}

	public Player createPlayer(Player newPlayer) {
		Player createdPlayer = playerRepository.save(newPlayer);
		return createdPlayer;
	}

	public Player updatePlayerBy_id(Player player) {
		Player updatedPlayer = playerRepository.save(player);
		return updatedPlayer;
	}

	public void deletePlayerBy_id(String _id) {
		Player foundPlayer = playerRepository.findPlayerBy_id(_id);
		playerRepository.delete(foundPlayer);
	}
}
