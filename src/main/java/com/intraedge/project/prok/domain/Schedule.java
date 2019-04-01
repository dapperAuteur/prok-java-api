package com.intraedge.project.prok.domain;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Schedule {

	@DBRef
	private User manager;
	@DBRef
	private ArrayList<Match> matches;
	private Date startDate;
	private Date endDate;
	
	
	public Schedule() {}
	
	public Schedule(User manager, ArrayList<Match> matches, Date startDate, Date endDate) {
		super();
		this.manager = manager;
		this.matches = matches;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public User getManager() {
		return manager;
	}
	public void setManager(User manager) {
		this.manager = manager;
	}
	public ArrayList<Match> getMatches() {
		return matches;
	}
	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Schedule [manager=" + manager + ", getManager()=" + getManager() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
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
		Schedule other = (Schedule) obj;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		return true;
	}
	

}
