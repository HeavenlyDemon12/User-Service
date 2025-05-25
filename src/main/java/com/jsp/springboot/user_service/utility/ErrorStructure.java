package com.jsp.springboot.user_service.utility;

public class ErrorStructure<T> {
	private int errorCode;
	private String eroorMessage;
	private T error;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getEroorMessage() {
		return eroorMessage;
	}
	public void setEroorMessage(String eroorMessage) {
		this.eroorMessage = eroorMessage;
	}
	public T getError() {
		return error;
	}
	public void setError(T error) {
		this.error = error;
	}

}
