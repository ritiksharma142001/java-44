package com.authentication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authentication.entities.User;
import com.authentication.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository repo;

	@Override
	public boolean usernameExists(String username) {
		User user = repo.findByUsername(username);		
		if(user != null) {
			return true;
		}
		return false;
	}

	@Override
	public void addUser(User user) {
		repo.save(user);		
	}
}
