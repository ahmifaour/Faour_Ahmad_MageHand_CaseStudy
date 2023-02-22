package com.ahmi.magehand.exceptions;

@SuppressWarnings("serial")
public class UserNotExistException extends Throwable {

	/**
	 * 
	 * Custom exception created for the event where a user is referenced, but they do not exist.
	 * 
	 */
	
	public UserNotExistException(String message) {
		
		super(message);
		
	}
	
}
