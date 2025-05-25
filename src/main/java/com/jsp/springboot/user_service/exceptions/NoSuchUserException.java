package com.jsp.springboot.user_service.exceptions;

public class NoSuchUserException extends RuntimeException{
	
	String message;
	
	public NoSuchUserException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
