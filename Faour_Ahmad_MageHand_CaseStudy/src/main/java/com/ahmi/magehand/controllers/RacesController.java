package com.ahmi.magehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RacesController {

	@GetMapping("/races")
	public String races() {

		return "races";

	}
	
}
