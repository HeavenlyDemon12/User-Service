package com.jsp.springboot.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot.user_service.entity.User;
import com.jsp.springboot.user_service.serviceimpl.UserServiceImpl;
import com.jsp.springboot.user_service.utility.ResponseStructure;

@RestController

public class UserController {
	
	@Autowired
	private UserServiceImpl us;
	
	@RequestMapping(value = "/add" , method = RequestMethod.POST)
	public ResponseEntity<ResponseStructure<User>> addUser(@RequestBody User u) {
		 User users =  us.addUser(u);
		 
		 ResponseStructure<User> resp=new ResponseStructure<User>();
		 resp.setStatus(users);
		 resp.setStatusMessage("User is added!!");
		 resp.setStatusCode(HttpStatus.CREATED.value());
		 
		return new ResponseEntity<ResponseStructure<User>>(resp,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/find-id" , method = RequestMethod.GET)
	public ResponseEntity<ResponseStructure<User>> findUserById(int userId) {
		 User users =  us.findUserById(userId);
		 
		 ResponseStructure<User> resp=new ResponseStructure<User>();
		 resp.setStatus(users);
		 resp.setStatusMessage("Users are Found!!");
		 resp.setStatusCode(HttpStatus.FOUND.value());
		 
		return new ResponseEntity<ResponseStructure<User>>(resp,HttpStatus.FOUND);
	}
	@RequestMapping(value = "/update-id" , method = RequestMethod.PUT)
	public ResponseEntity<ResponseStructure<User>> updateUserById(int userId,@RequestBody User updateUser) {
		 User users =  us.updateUserById(userId, updateUser);		 
		 ResponseStructure<User> resp=new ResponseStructure<User>();
		 resp.setStatus(users);
		 resp.setStatusMessage("User values are Updated!!");
		 resp.setStatusCode(HttpStatus.OK.value());
		 
		return new ResponseEntity<ResponseStructure<User>>(resp,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete-id" , method = RequestMethod.DELETE)
	public ResponseEntity<ResponseStructure<User>> deleteUserById(int userId) {
		 User users =  us.deleteUserById(userId);
		 
		 ResponseStructure<User> resp=new ResponseStructure<User>();
		 resp.setStatus(users);
		 resp.setStatusMessage("Users is Deleted!!");
		 resp.setStatusCode(HttpStatus.OK.value());
		 
		return new ResponseEntity<ResponseStructure<User>>(resp,HttpStatus.OK);
	}
}
