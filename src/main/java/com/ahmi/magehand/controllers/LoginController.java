package com.ahmi.magehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * Controller for the "login.html" webpage.
 *
 */

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login() {

		return "login";

	}

}
