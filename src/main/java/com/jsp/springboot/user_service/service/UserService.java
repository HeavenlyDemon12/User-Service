package com.jsp.springboot.user_service.service;

import com.jsp.springboot.user_service.entity.User;

public interface UserService {
	
	
	User addUser(User u);
	User findUserById(int userId);
	User updateUserById(int userId,User updatedUser);
	User deleteUserById(int userId);


	

}
