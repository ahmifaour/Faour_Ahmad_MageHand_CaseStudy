package com.ahmi.magehand.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ahmi.magehand.exceptions.CharacterNotExistException;
import com.ahmi.magehand.models.CharacterSheets;
import com.ahmi.magehand.services.CharacterSheetsService;

@Controller
public class CharacterSheetsController {
	
	private CharacterSheetsService characterSheetsService;
	
	@GetMapping("/charactersheets")
	public String displayNewCharacterSheet(Model model) {
		
		model.addAttribute("charactersheets", new CharacterSheets());
		return "charactersheets";
		
	}
	
	@GetMapping("/charactersheets/delete/{id}")
	public String deleteAccount(@PathVariable("id") Long csId, RedirectAttributes rAttributes) {
		
		try {
			
			characterSheetsService.deleteCharacter(csId);
			rAttributes.addFlashAttribute("message", "Character with an ID of: " + csId + " now lives on in our hearts...(deleted)");
			
		} catch (CharacterNotExistException exception) {
			
			rAttributes.addFlashAttribute("message", exception.getMessage());
			
		}
		
		return "redirect:/home";
		
	}
	
	@GetMapping("/charactersheets/createcharacter")
	public String displayNewForm(Model model) {
		
		model.addAttribute("charactersheets", new CharacterSheets());
		return "createcharacter";
		
	}
	
	
	@PostMapping("charactersheets/save")
	public String saveNewCharacter(CharacterSheets characterSheets, RedirectAttributes rAttributes) {
		
		characterSheetsService.saveCharacter(characterSheets);
		rAttributes.addFlashAttribute("message", "Congratulations! You have successfully created a new character. May great adventures find you!");
		return "redirect:/charactersheets";
		
	}
	
	@GetMapping("/charactersheets/editcharacter")
	public String displayCharacterForm(@PathVariable("csId") Long csId, RedirectAttributes rAttributes, Model model) {
		
		try {
			
		characterSheetsService.getCharacter(csId);
		model.addAttribute("charactersheets", csId);
		return "createcharacter";
	
		} catch (CharacterNotExistException exception) {
			
			rAttributes.addFlashAttribute("message", exception.getMessage());
			return "redirect:/charactersheets";
			
		}
	}

}
