package com.ahmi.magehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * Controller for the "index.html" webpage. This is also the homepage for the application.
 *
 */

@Controller
public class IndexController {
	
	@GetMapping("/index")
	public String home() {

		return "index";

	}

}
