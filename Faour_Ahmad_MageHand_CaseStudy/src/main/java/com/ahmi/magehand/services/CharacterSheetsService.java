package com.ahmi.magehand.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ahmi.magehand.exceptions.CharacterNotExistException;
import com.ahmi.magehand.models.CharacterSheets;
import com.ahmi.magehand.repository.CharacterSheetRepository;

@Service
public class CharacterSheetsService {
	
	private CharacterSheetRepository characterSheetRepository;
	
	public Iterable<CharacterSheets> findCharByName() {
		
		return characterSheetRepository.findAll();
		
	}
	
	public CharacterSheets getCharacter(Long csId) throws CharacterNotExistException {
		
		Optional<CharacterSheets> charResult = characterSheetRepository.findCharacterByName(csId);
		if(charResult.isPresent()) {
			
			return charResult.get();
			
		}
		
		throw new CharacterNotExistException("There are no characters with an ID of: " + csId);
		
	}
	
	
	public void saveCharacter(CharacterSheets characterSheet) {
		
		characterSheetRepository.save(characterSheet);
		
	}
	
	
	public void deleteCharacter (Long id) throws CharacterNotExistException {
		
		characterSheetRepository.delete(id);
		
	}

}
