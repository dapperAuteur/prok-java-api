package com.intraedge.project.prok.exceptions;

public class UserIdExceptionResponse {
	
	private String userId;
	
	public UserIdExceptionResponse(String userId) {
		this.userId = userId;
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
	
	
}
