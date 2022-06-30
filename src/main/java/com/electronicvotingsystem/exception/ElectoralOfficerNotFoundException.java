package com.electronicvotingsystem.exception;

public class ElectoralOfficerNotFoundException extends RuntimeException {
	public ElectoralOfficerNotFoundException() {
	}

	public ElectoralOfficerNotFoundException(String message) {
		super(message);
	}
}
