package com.intraedge.project.prok.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
public class Player {
	
	@Id
	private String _id;
	private String nickname;
	private String userId;
	private int atBats;
	private int kicks;
	private int walks;
	private int pitchingOuts;
	private int inningsPitched;
	
	
	public Player() {}
	
	public Player(String _id, String nickname, String userId, int atBats, int kicks, int walks, int pitchingOuts,
			int inningsPitched) {
		super();
		this._id = _id;
		this.nickname = nickname;
		this.userId = userId;
		this.atBats = atBats;
		this.kicks = kicks;
		this.walks = walks;
		this.pitchingOuts = pitchingOuts;
		this.inningsPitched = inningsPitched;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
		return "Player [_id=" + _id + ", nickname=" + nickname + ", userId=" + userId + ", atBats=" + atBats + ", kicks="
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
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (walks != other.walks)
			return false;
		return true;
	}

}
