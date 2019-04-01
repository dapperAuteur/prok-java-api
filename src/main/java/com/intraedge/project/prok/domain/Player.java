package com.intraedge.project.prok.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
public class Player {
	
	@Id
	private ObjectId _id;
	private String nickname;
	@DBRef
	private User user;
	private int atBats;
	private int kicks;
	private int walks;
	private int pitchingOuts;
	private int inningsPitched;
	
	
	public Player() {}
	
	public Player(ObjectId _id, String nickname, User user, int atBats, int kicks, int walks, int pitchingOuts,
			int inningsPitched) {
		super();
		this._id = _id;
		this.nickname = nickname;
		this.user = user;
		this.atBats = atBats;
		this.kicks = kicks;
		this.walks = walks;
		this.pitchingOuts = pitchingOuts;
		this.inningsPitched = inningsPitched;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the atBats
	 */
	public int getAtBats() {
		return atBats;
	}
	/**
	 * @param atBats the atBats to set
	 */
	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}
	/**
	 * @return the kicks
	 */
	public int getKicks() {
		return kicks;
	}
	/**
	 * @param kicks the kicks to set
	 */
	public void setKicks(int kicks) {
		this.kicks = kicks;
	}
	/**
	 * @return the walks
	 */
	public int getWalks() {
		return walks;
	}
	/**
	 * @param walks the walks to set
	 */
	public void setWalks(int walks) {
		this.walks = walks;
	}
	/**
	 * @return the pitchingOuts
	 */
	public int getPitchingOuts() {
		return pitchingOuts;
	}
	/**
	 * @param pitchingOuts the pitchingOuts to set
	 */
	public void setPitchingOuts(int pitchingOuts) {
		this.pitchingOuts = pitchingOuts;
	}
	/**
	 * @return the inningsPitched
	 */
	public int getInningsPitched() {
		return inningsPitched;
	}
	/**
	 * @param inningsPitched the inningsPitched to set
	 */
	public void setInningsPitched(int inningsPitched) {
		this.inningsPitched = inningsPitched;
	}

	@Override
	public String toString() {
		return "Player [_id=" + _id + ", nickname=" + nickname + ", user=" + user + ", atBats=" + atBats + ", kicks="
				+ kicks + ", walks=" + walks + ", pitchingOuts=" + pitchingOuts + ", inningsPitched=" + inningsPitched
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		result = prime * result + atBats;
		result = prime * result + inningsPitched;
		result = prime * result + kicks;
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + pitchingOuts;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + walks;
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
		Player other = (Player) obj;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		if (atBats != other.atBats)
			return false;
		if (inningsPitched != other.inningsPitched)
			return false;
		if (kicks != other.kicks)
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		if (pitchingOuts != other.pitchingOuts)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (walks != other.walks)
			return false;
		return true;
	}

}
