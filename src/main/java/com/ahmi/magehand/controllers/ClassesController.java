package com.ahmi.magehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * Controller for the "classes.html" webpage.
 *
 */

@Controller
public class ClassesController {
	
	@GetMapping("/classes")
	public String classes() {
		
		return "classes";
		
	}

}
