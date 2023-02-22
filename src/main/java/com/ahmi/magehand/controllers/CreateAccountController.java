package com.ahmi.magehand.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ahmi.magehand.exceptions.UserNotExistException;
import com.ahmi.magehand.models.User;
import com.ahmi.magehand.services.UserService;


@Controller
public class CreateAccountController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/createaccount")
	public String displayNewForm(Model model) {
		
		model.addAttribute("user", new User());
		return "createaccount";
		
	}
	
	
	@GetMapping("/createaccount/delete/{id}")
	public String deleteAccount(@PathVariable("id") Long id, RedirectAttributes rAttributes) {
		
		try {
			
			userService.deleteUser(id);
			rAttributes.addFlashAttribute("message", "The user account with an ID of: " + id + " has been fed to the Mindflayers (deleted).");			
		} catch (UserNotExistException e ) {
			
			rAttributes.addFlashAttribute("message", e.getMessage());
			
		}
		
		return "redirect:/home";
		
	}
	
	
	@PostMapping("/createaccount/save")
	public String saveNewAccount(User user, RedirectAttributes rAttributes) {
		
		userService.saveUser(user);
		rAttributes.addFlashAttribute("message", "You have successfully created your account.");
		return "redirect:/home";
		
	}
		
}