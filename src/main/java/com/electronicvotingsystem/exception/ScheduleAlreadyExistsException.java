package com.electronicvotingsystem.exception;

public class ScheduleAlreadyExistsException extends RuntimeException {
	
	public ScheduleAlreadyExistsException() {
	}

	public ScheduleAlreadyExistsException(String message) {
		super(message);
	}

}
