package com.jsp.springboot.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.springboot.user_service.entity.User;

public interface UserRepository extends JpaRepository<User, Integer > {

}
