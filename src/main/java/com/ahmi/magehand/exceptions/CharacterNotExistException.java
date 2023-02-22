package com.ahmi.magehand.exceptions;

@SuppressWarnings("serial")
public class CharacterNotExistException extends Throwable {
	
	/**
	 * 
	 * Custom exception created for the event in which a character sheet is referenced, but it does not exist.
	 * 
	 */
	
	public CharacterNotExistException(String message) {
		
		super(message);
		
	}

}
