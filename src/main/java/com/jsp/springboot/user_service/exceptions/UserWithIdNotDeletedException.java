package com.jsp.springboot.user_service.exceptions;

public class UserWithIdNotDeletedException extends RuntimeException {
	
	String message;
	
	public  UserWithIdNotDeletedException(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
