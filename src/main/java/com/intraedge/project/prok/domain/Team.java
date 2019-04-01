package com.intraedge.project.prok.domain;

import java.util.ArrayList;

public class Team {
	
	private String teamName;
	private ArrayList<Player> players;
	private Player captain;
	private User manager;
	private int wins;
	private int losses;
	private int ties;
	private int championships;
	
	
	
	public Team() {}
	public Team(String teamName, ArrayList<Player> players, Player captain, User manager, int wins, int losses,
			int ties, int championships) {
		super();
		this.teamName = teamName;
		this.players = players;
		this.captain = captain;
		this.manager = manager;
		this.wins = wins;
		this.losses = losses;
		this.ties = ties;
		this.championships = championships;
	}
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	/**
	 * @return the captain
	 */
	public Player getCaptain() {
		return captain;
	}
	/**
	 * @param captain the captain to set
	 */
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	/**
	 * @return the manager
	 */
	public User getManager() {
		return manager;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(User manager) {
		this.manager = manager;
	}
	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}
	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}
	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}
	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}
	/**
	 * @return the ties
	 */
	public int getTies() {
		return ties;
	}
	/**
	 * @param ties the ties to set
	 */
	public void setTies(int ties) {
		this.ties = ties;
	}
	/**
	 * @return the championships
	 */
	public int getChampionships() {
		return championships;
	}
	/**
	 * @param championships the championships to set
	 */
	public void setChampionships(int championships) {
		this.championships = championships;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", captain=" + captain + ", manager=" + manager + ", wins=" + wins
				+ ", losses=" + losses + ", ties=" + ties + ", championships=" + championships + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((captain == null) ? 0 : captain.hashCode());
		result = prime * result + championships;
		result = prime * result + losses;
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + ties;
		result = prime * result + wins;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Team other = (Team) obj;
		if (captain == null) {
			if (other.captain != null)
				return false;
		} else if (!captain.equals(other.captain))
			return false;
		if (championships != other.championships)
			return false;
		if (losses != other.losses)
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (ties != other.ties)
			return false;
		if (wins != other.wins)
			return false;
		return true;
	}

}
