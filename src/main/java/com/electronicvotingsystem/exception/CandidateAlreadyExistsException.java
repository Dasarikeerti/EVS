package com.electronicvotingsystem.exception;

public class CandidateAlreadyExistsException extends RuntimeException {

	
	public CandidateAlreadyExistsException() {
	}

	public CandidateAlreadyExistsException(String message) {
		super(message);
	}

}
