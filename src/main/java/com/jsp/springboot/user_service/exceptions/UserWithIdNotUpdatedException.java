package com.jsp.springboot.user_service.exceptions;

public class UserWithIdNotUpdatedException extends RuntimeException {
	String message;
	
	public  UserWithIdNotUpdatedException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
}
