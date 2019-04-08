package com.intraedge.project.prok.exceptions;

public class UsernameAlreadyExistsResponse {

	private String username;

	public UsernameAlreadyExistsResponse(String username) {
		super();
		this.username = username;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
