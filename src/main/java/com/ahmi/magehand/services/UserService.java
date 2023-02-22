package com.ahmi.magehand.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmi.magehand.exceptions.UserNotExistException;
import com.ahmi.magehand.models.User;
import com.ahmi.magehand.repositories.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	public Iterable<User> findAllUsers() {
		
		return userRepository.findAll();
		
	}
	
	public User getUser(Long id) throws UserNotExistException {
		
		Optional<User> userResult = userRepository.findById(id);
		if(userResult.isPresent()) {
			
			return userResult.get();
			
		}
		
		throw new UserNotExistException("There are no users with an ID of: " + id);
		
	}
	
	public void deleteUser(Long id) throws UserNotExistException {
		
		Optional<User> find = userRepository.findById(id);
		if(find == null) {
			
			throw new UserNotExistException("There are no users with an ID of: " + id);
			
		}
		
		userRepository.deleteById(id);
		
	}
	
	public void saveUser(User user) {
		
		userRepository.save(user);
		
	}
	
}
