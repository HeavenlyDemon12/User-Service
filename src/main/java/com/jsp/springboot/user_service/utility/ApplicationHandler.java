package com.jsp.springboot.user_service.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.springboot.user_service.exceptions.NoSuchUserException;

@RestControllerAdvice
public class ApplicationHandler {

	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> handleUserNotFound(NoSuchUserException e){
		ErrorStructure<String> er=new ErrorStructure<String>();
		er.setErrorCode(HttpStatus.NOT_FOUND.value());
		er.setEroorMessage(e.getMessage());
		er.setError("Employee with the requested ID is not present in the Data Base");
		return new ResponseEntity<ErrorStructure<String>>(er,HttpStatus.NOT_FOUND);
	}
	
}
