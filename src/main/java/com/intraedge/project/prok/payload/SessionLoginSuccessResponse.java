package com.intraedge.project.prok.payload;

public class SessionLoginSuccessResponse {
	
	private boolean success;
	private String session;
	
	public SessionLoginSuccessResponse(boolean success, String session) {
		super();
		this.success = success;
		this.session = session;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the session
	 */
	public String getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public void setSession(String session) {
		this.session = session;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SessionLoginSuccessResponse [success=" + success + ", session=" + session + "]";
	}
	
	
}
