package com.intraedge.project.prok.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "matches")
public class Match {

	@Id
	private String _id;
	@DBRef
	private String scoreKeeper;
	@DBRef
	private String homeTeam;
	@DBRef
	private List<String> homeTeamKickingOrder;
	private int homeTeamScore;
	@DBRef
	private String awayTeam;
	@DBRef
	private List<String> awayTeamKickingOrder;
	private int awayTeamScore;
	private String locationAddress;
	private String locationName;
	private String locationGPS;
	private String locationCity;
	private String locationState;
	private String locationZipCode;
	private String field;
	private String currentInning;
	private Boolean extraInnings;
	private int balls;
	private int strikes;
	private int fouls;
	private int outs;
	private Boolean encroachmentWarning;
	private int matchLength;
	private String lengthMeasured;
	private Date startTime;
	
	
	
	public Match() {}
	
	public Match(String _id, String scoreKeeper, String homeTeam, List<String> homeTeamKickingOrder,
			int homeTeamScore, String awayTeam, List<String> awayTeamKickingOrder, int awayTeamScore,
			String locationAddress, String locationName, String locationGPS, String locationCity, String locationState,
			String locationZipCode, String field, String currentInning, Boolean extraInnings, int balls, int strikes,
			int fouls, int outs, Boolean encroachmentWarning, int matchLength, String lengthMeasured, Date startTime) {
		super();
		this._id = _id;
		this.scoreKeeper = scoreKeeper;
		this.homeTeam = homeTeam;
		this.homeTeamKickingOrder = homeTeamKickingOrder;
		this.homeTeamScore = homeTeamScore;
		this.awayTeam = awayTeam;
		this.awayTeamKickingOrder = awayTeamKickingOrder;
		this.awayTeamScore = awayTeamScore;
		this.locationAddress = locationAddress;
		this.locationName = locationName;
		this.locationGPS = locationGPS;
		this.locationCity = locationCity;
		this.locationState = locationState;
		this.locationZipCode = locationZipCode;
		this.field = field;
		this.currentInning = currentInning;
		this.extraInnings = extraInnings;
		this.balls = balls;
		this.strikes = strikes;
		this.fouls = fouls;
		this.outs = outs;
		this.encroachmentWarning = encroachmentWarning;
		this.matchLength = matchLength;
		this.lengthMeasured = lengthMeasured;
		this.startTime = startTime;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getScoreKeeper() {
		return scoreKeeper;
	}
	public void setScoreKeeper(String scoreKeeper) {
		this.scoreKeeper = scoreKeeper;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public List<String> getHomeTeamKickingOrder() {
		return homeTeamKickingOrder;
	}
	public void setHomeTeamKickingOrder(List<String> homeTeamKickingOrder) {
		this.homeTeamKickingOrder = homeTeamKickingOrder;
	}
	public int getHomeTeamScore() {
		return homeTeamScore;
	}
	public void setHomeTeamScore(int homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	public List<String> getAwayTeamKickingOrder() {
		return awayTeamKickingOrder;
	}
	public void setAwayTeamKickingOrder(List<String> awayTeamKickingOrder) {
		this.awayTeamKickingOrder = awayTeamKickingOrder;
	}
	public int getAwayTeamScore() {
		return awayTeamScore;
	}
	public void setAwayTeamScore(int awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}
	public String getLocationAddress() {
		return locationAddress;
	}
	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationGPS() {
		return locationGPS;
	}
	public void setLocationGPS(String locationGPS) {
		this.locationGPS = locationGPS;
	}
	public String getLocationCity() {
		return locationCity;
	}
	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	public String getLocationState() {
		return locationState;
	}
	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}
	public String getLocationZipCode() {
		return locationZipCode;
	}
	public void setLocationZipCode(String locationZipCode) {
		this.locationZipCode = locationZipCode;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getCurrentInning() {
		return currentInning;
	}
	public void setCurrentInning(String currentInning) {
		this.currentInning = currentInning;
	}
	public Boolean getExtraInnings() {
		return extraInnings;
	}
	public void setExtraInnings(Boolean extraInnings) {
		this.extraInnings = extraInnings;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public int getStrikes() {
		return strikes;
	}
	public void setStrikes(int strikes) {
		this.strikes = strikes;
	}
	public int getFouls() {
		return fouls;
	}
	public void setFouls(int fouls) {
		this.fouls = fouls;
	}
	public int getOuts() {
		return outs;
	}
	public void setOuts(int outs) {
		this.outs = outs;
	}
	public Boolean getEncroachmentWarning() {
		return encroachmentWarning;
	}
	public void setEncroachmentWarning(Boolean encroachmentWarning) {
		this.encroachmentWarning = encroachmentWarning;
	}
	public int getMatchLength() {
		return matchLength;
	}
	public void setMatchLength(int matchLength) {
		this.matchLength = matchLength;
	}
	public String getLengthMeasured() {
		return lengthMeasured;
	}
	public void setLengthMeasured(String lengthMeasured) {
		this.lengthMeasured = lengthMeasured;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Override
	public String toString() {
		return "Match [_id=" + _id + ", scoreKeeper=" + scoreKeeper + ", homeTeam=" + homeTeam
				+ ", homeTeamKickingOrder=" + homeTeamKickingOrder + ", homeTeamScore=" + homeTeamScore + ", awayTeam="
				+ awayTeam + ", awayTeamKickingOrder=" + awayTeamKickingOrder + ", awayTeamScore=" + awayTeamScore
				+ ", locationAddress=" + locationAddress + ", locationName=" + locationName + ", locationGPS="
				+ locationGPS + ", locationCity=" + locationCity + ", locationState=" + locationState
				+ ", locationZipCode=" + locationZipCode + ", field=" + field + ", currentInning=" + currentInning
				+ ", extraInnings=" + extraInnings + ", balls=" + balls + ", strikes=" + strikes + ", fouls=" + fouls
				+ ", outs=" + outs + ", encroachmentWarning=" + encroachmentWarning + ", matchLength=" + matchLength
				+ ", lengthMeasured=" + lengthMeasured + ", startTime=" + startTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		result = prime * result + ((awayTeam == null) ? 0 : awayTeam.hashCode());
		result = prime * result + ((awayTeamKickingOrder == null) ? 0 : awayTeamKickingOrder.hashCode());
		result = prime * result + awayTeamScore;
		result = prime * result + balls;
		result = prime * result + ((currentInning == null) ? 0 : currentInning.hashCode());
		result = prime * result + ((encroachmentWarning == null) ? 0 : encroachmentWarning.hashCode());
		result = prime * result + ((extraInnings == null) ? 0 : extraInnings.hashCode());
		result = prime * result + ((field == null) ? 0 : field.hashCode());
		result = prime * result + fouls;
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		result = prime * result + ((homeTeamKickingOrder == null) ? 0 : homeTeamKickingOrder.hashCode());
		result = prime * result + homeTeamScore;
		result = prime * result + ((lengthMeasured == null) ? 0 : lengthMeasured.hashCode());
		result = prime * result + ((locationAddress == null) ? 0 : locationAddress.hashCode());
		result = prime * result + ((locationCity == null) ? 0 : locationCity.hashCode());
		result = prime * result + ((locationGPS == null) ? 0 : locationGPS.hashCode());
		result = prime * result + ((locationName == null) ? 0 : locationName.hashCode());
		result = prime * result + ((locationState == null) ? 0 : locationState.hashCode());
		result = prime * result + ((locationZipCode == null) ? 0 : locationZipCode.hashCode());
		result = prime * result + matchLength;
		result = prime * result + outs;
		result = prime * result + ((scoreKeeper == null) ? 0 : scoreKeeper.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		result = prime * result + strikes;
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
		Match other = (Match) obj;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		if (awayTeam == null) {
			if (other.awayTeam != null)
				return false;
		} else if (!awayTeam.equals(other.awayTeam))
			return false;
		if (awayTeamKickingOrder == null) {
			if (other.awayTeamKickingOrder != null)
				return false;
		} else if (!awayTeamKickingOrder.equals(other.awayTeamKickingOrder))
			return false;
		if (awayTeamScore != other.awayTeamScore)
			return false;
		if (balls != other.balls)
			return false;
		if (currentInning == null) {
			if (other.currentInning != null)
				return false;
		} else if (!currentInning.equals(other.currentInning))
			return false;
		if (encroachmentWarning == null) {
			if (other.encroachmentWarning != null)
				return false;
		} else if (!encroachmentWarning.equals(other.encroachmentWarning))
			return false;
		if (extraInnings == null) {
			if (other.extraInnings != null)
				return false;
		} else if (!extraInnings.equals(other.extraInnings))
			return false;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		if (fouls != other.fouls)
			return false;
		if (homeTeam == null) {
			if (other.homeTeam != null)
				return false;
		} else if (!homeTeam.equals(other.homeTeam))
			return false;
		if (homeTeamKickingOrder == null) {
			if (other.homeTeamKickingOrder != null)
				return false;
		} else if (!homeTeamKickingOrder.equals(other.homeTeamKickingOrder))
			return false;
		if (homeTeamScore != other.homeTeamScore)
			return false;
		if (lengthMeasured == null) {
			if (other.lengthMeasured != null)
				return false;
		} else if (!lengthMeasured.equals(other.lengthMeasured))
			return false;
		if (locationAddress == null) {
			if (other.locationAddress != null)
				return false;
		} else if (!locationAddress.equals(other.locationAddress))
			return false;
		if (locationCity == null) {
			if (other.locationCity != null)
				return false;
		} else if (!locationCity.equals(other.locationCity))
			return false;
		if (locationGPS == null) {
			if (other.locationGPS != null)
				return false;
		} else if (!locationGPS.equals(other.locationGPS))
			return false;
		if (locationName == null) {
			if (other.locationName != null)
				return false;
		} else if (!locationName.equals(other.locationName))
			return false;
		if (locationState == null) {
			if (other.locationState != null)
				return false;
		} else if (!locationState.equals(other.locationState))
			return false;
		if (locationZipCode == null) {
			if (other.locationZipCode != null)
				return false;
		} else if (!locationZipCode.equals(other.locationZipCode))
			return false;
		if (matchLength != other.matchLength)
			return false;
		if (outs != other.outs)
			return false;
		if (scoreKeeper == null) {
			if (other.scoreKeeper != null)
				return false;
		} else if (!scoreKeeper.equals(other.scoreKeeper))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		if (strikes != other.strikes)
			return false;
		return true;
	}

}
