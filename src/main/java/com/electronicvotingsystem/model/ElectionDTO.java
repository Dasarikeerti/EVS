package com.electronicvotingsystem.model;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class ElectionDTO {

	private int electionId;

	@NotNull
	private String electionName;

	@NotNull
	private String state;

	

	public int getElectionId() {
		return electionId;
	}


	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}


	public String getElectionName() {
		return electionName;
	}


	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


}
