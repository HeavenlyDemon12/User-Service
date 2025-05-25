package com.jsp.springboot.user_service.utility;

public class ErrorStructure<T> {
	private int errorCode;
	private String errorMessage;
	private T error;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public T getError() {
		return error;
	}
	public void setError(T error) {
		this.error = error;
	}

}
