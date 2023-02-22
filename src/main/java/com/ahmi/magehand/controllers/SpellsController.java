package com.ahmi.magehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * Controller handling the "spells.html" webpage.
 *
 */

@Controller
public class SpellsController {
	
	@GetMapping("/spells")
	public String spells() {

		return "spells";

	}

}
