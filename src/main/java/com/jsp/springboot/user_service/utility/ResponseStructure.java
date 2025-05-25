package com.jsp.springboot.user_service.utility;

public class ResponseStructure<T> {

	private int statusCode;
	private String statusMessage;
	private T status;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public T getStatus() {
		return status;
	}
	public void setStatus(T status) {
		this.status = status;
	}
	
	
}
