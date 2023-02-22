package com.ahmi.magehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * Controller for the "items.html" webpage.
 *
 */

@Controller
public class ItemsController {
	
	@GetMapping("/items")
	public String items() {

		return "items";

	}

}
