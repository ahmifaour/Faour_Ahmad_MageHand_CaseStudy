package com.ahmi.magehand.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ahmi.magehand.models.User;
import com.ahmi.magehand.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	public UserController(UserService userService) {
		
		this.service = userService;
		
	}
	
	@GetMapping("/users")
	public String showAllUsers(Model model) {
		
		Iterable<User> findUsers = service.findAllUsers();
		model.addAttribute("findUsers", findUsers);
		return "users";
		
	}
	
}
