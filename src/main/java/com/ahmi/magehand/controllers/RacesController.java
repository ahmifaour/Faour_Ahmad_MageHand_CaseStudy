package com.ahmi.magehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * Controller for the "races.html" webpage.
 *
 */

@Controller
public class RacesController {

	@GetMapping("/races")
	public String races() {

		return "races";

	}
	
}
