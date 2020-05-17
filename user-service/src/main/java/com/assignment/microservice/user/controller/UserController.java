package com.assignment.microservice.user.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.microservice.user.entity.UserEntity;
import com.assignment.microservice.user.exception.UserNotExistException;
import com.assignment.microservice.user.model.UserDetails;
import com.assignment.microservice.user.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "/user/{id}")
	UserDetails getUser(@PathVariable long id) throws UserNotExistException {
		UserDetails userDetails = null;
		Optional<UserEntity> userEntityOptional = userRepository.findById(id);
		if(userEntityOptional.isPresent()) {
			UserEntity userEntity= userEntityOptional.get();
			userDetails = new UserDetails(userEntity.getName(), userEntity.getAge(), userEntity.getEmail());
		} else {
			throw new UserNotExistException("user not found exist for id:  "+id);
		}
		
		return userDetails;
	}
	
	@GetMapping(path="/user/message")
	String getMessage() {
		return "application is up and running";
	}

}
