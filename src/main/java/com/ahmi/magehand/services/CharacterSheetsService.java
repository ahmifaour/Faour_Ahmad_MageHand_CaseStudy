package com.ahmi.magehand.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmi.magehand.exceptions.CharacterNotExistException;
import com.ahmi.magehand.models.CharacterSheets;
import com.ahmi.magehand.repositories.CharacterSheetRepository;

@Service
public class CharacterSheetsService {
	
	@Autowired
	private CharacterSheetRepository characterSheetRepository;
	
	public Iterable<CharacterSheets> findCharacterBycsId() {
		
		return characterSheetRepository.findAll();
		
	}
	
	public CharacterSheets getCharacter(Long csId) throws CharacterNotExistException {
		
		Optional<CharacterSheets> charResult = characterSheetRepository.findCharacterBycsId(csId);
		if(charResult.isPresent()) {
			
			return charResult.get();
			
		}
		
		throw new CharacterNotExistException("There are no characters with an ID of: " + csId);
		
	}
	
	
	public void saveCharacter(CharacterSheets characterSheet) {
		
		characterSheetRepository.save(characterSheet);
		
	}
	
	
	public void deleteCharacter (Long csId) throws CharacterNotExistException {
		
		characterSheetRepository.deleteCharacterBycsId(csId);
		
	}

}
