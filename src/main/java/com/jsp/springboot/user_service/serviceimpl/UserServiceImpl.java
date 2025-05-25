package com.jsp.springboot.user_service.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot.user_service.entity.User;
import com.jsp.springboot.user_service.exceptions.NoSuchUserException;
import com.jsp.springboot.user_service.exceptions.UserWithIdNotDeletedException;
import com.jsp.springboot.user_service.exceptions.UserWithIdNotUpdatedException;
import com.jsp.springboot.user_service.repository.UserRepository;
import com.jsp.springboot.user_service.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository ur;

	@Override
	public User addUser(User u) {
		ur.save(u);		
	return u;
	}

	@Override
	public User findUserById(int userId) {
		Optional<User> opt = ur.findById(userId);		
		
		if(opt.isEmpty()) {
			throw new NoSuchUserException("No Employee with the provided ID Found");
		}else {
			User us =opt.get();
			return us;
		}
	}
	
	@Override
	public User updateUserById(int userId, User updatedUser) {
		Optional<User> opt = ur.findById(userId);		
		
		if(opt.isEmpty()) {
			throw new UserWithIdNotUpdatedException("No Employee with the provided ID Found");
		}else {
			User existingUser =opt.get();
			updatedUser.setUserId(existingUser.getUserId());
			ur.save(updatedUser);			
			return updatedUser;
		}
	}
	
	@Override
	public User deleteUserById(int userId) {
		Optional<User> opt = ur.findById(userId);		
		
		if(opt.isEmpty()) {
			throw new UserWithIdNotDeletedException("No Employee with the provided ID Found");
		}else {
			User us =opt.get();
			ur.delete(us);			
			return us;
			
		}
	}
}
