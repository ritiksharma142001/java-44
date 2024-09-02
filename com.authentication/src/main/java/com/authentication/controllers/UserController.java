package com.authentication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.authentication.entities.User;
import com.authentication.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public String addUser(@ModelAttribute User user) {
		
//		System.out.println(user);
		//check if username already exists
		boolean status =  service.usernameExists(user.getUsername());
		//username does not exist
		if(status == false) {
			service.addUser(user);
			return "login";
		}
		//username already exists
		else {
			System.out.println("username already exists");
		}
		return "login";
	}

}
