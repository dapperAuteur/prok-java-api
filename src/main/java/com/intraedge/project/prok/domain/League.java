package com.intraedge.project.prok.domain;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "leagues")
public class League {
	
	@Id
	private ObjectId _id;
	private String leagueName;
	@DBRef
	private ArrayList<Team> teams;
	@DBRef
	private User leagueManager;
	@DBRef
	private Schedule schedule;
	
	public League() {}
	
	public League(ObjectId _id, String leagueName, ArrayList<Team> teams, User leagueManager, Schedule schedule) {
		super();
		this._id = _id;
		this.leagueName = leagueName;
		this.teams = teams;
		this.leagueManager = leagueManager;
		this.schedule = schedule;
	}

	public ObjectId get_id() {
		return _id;
	}
	
//	public String get_id() {
//		return _id.toHexString();
//	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public ArrayList<Team> getTeams() {
		return teams;
	}
	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	public User getLeagueManager() {
		return leagueManager;
	}
	public void setLeagueManager(User leagueManager) {
		this.leagueManager = leagueManager;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "League [_id=" + _id + ", leagueName=" + leagueName + ", teams=" + teams + ", leagueManager="
				+ leagueManager + ", schedule=" + schedule + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		result = prime * result + ((leagueManager == null) ? 0 : leagueManager.hashCode());
		result = prime * result + ((leagueName == null) ? 0 : leagueName.hashCode());
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		result = prime * result + ((teams == null) ? 0 : teams.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		League other = (League) obj;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		if (leagueManager == null) {
			if (other.leagueManager != null)
				return false;
		} else if (!leagueManager.equals(other.leagueManager))
			return false;
		if (leagueName == null) {
			if (other.leagueName != null)
				return false;
		} else if (!leagueName.equals(other.leagueName))
			return false;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		if (teams == null) {
			if (other.teams != null)
				return false;
		} else if (!teams.equals(other.teams))
			return false;
		return true;
	}

}
