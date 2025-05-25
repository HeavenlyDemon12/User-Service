package com.jsp.springboot.user_service.service;

import com.jsp.springboot.user_service.entity.User;

public interface UserService {
	
	
	public User addUser(User u);
	public User findUserById(int userId);
	public User updateUserById(int userId,User updatedUser);
	public User deleteUserById(int userId);


	

}
