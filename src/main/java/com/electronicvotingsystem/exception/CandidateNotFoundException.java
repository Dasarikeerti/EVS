package com.electronicvotingsystem.exception;

public class CandidateNotFoundException extends RuntimeException{
	
	public CandidateNotFoundException() {
	}

	public CandidateNotFoundException(String message) {
		super(message);
	}
}
