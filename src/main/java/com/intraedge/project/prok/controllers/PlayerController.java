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

import com.intraedge.project.prok.domain.Player;
import com.intraedge.project.prok.services.PlayerService;

/**
 * PlayerController
 */
@RestController
@RequestMapping("/players")
public class PlayerController {

  @Autowired
  private PlayerService playerService;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public List<Player> getPlayers() {
    List<Player> players = playerService.getPlayers();
    return players;
  }

  @RequestMapping(value="/{_id}", method=RequestMethod.GET)
  public Player getPlayerBy_id(@PathVariable("_id") String _id) {
    return playerService.findPlayerBy_id(_id);
  }

  @RequestMapping(value = "/{_id}", method = RequestMethod.PATCH)
  public Player modifyPlayerBy_id(@PathVariable("_id") String _id, @Valid @RequestBody Player player) {
    player.set_id(_id);
    playerService.updatePlayerBy_id(player);
    return player;
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Player createPlayer(@Valid @RequestBody Player newPlayer) {
    Player createdPlayer = playerService.createPlayer(newPlayer);
    return createdPlayer;
  }

  @RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deletePlayer(@PathVariable String _id) {
    playerService.deletePlayerBy_id(_id);
    return new ResponseEntity<String>("Player with ID: '" + _id + "' was deleted", HttpStatus.OK);
  }

}