package com.electronicvotingsystem.exception;

public class ScheduleNotFoundException extends RuntimeException{
	
	public ScheduleNotFoundException() {
	}

	public ScheduleNotFoundException(String message) {
		super(message);
	}
}
