package com.electronicvotingsystem.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class ElectionDTO {

	private int electionId;

	@NotNull
	private String electionName;

	@NotNull
	private String state;

	@NotNull
	private List<CandidateDTO> candidateDTOs = new ArrayList<>();
	
	
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


	public List<CandidateDTO> getCandidateDTOs() {
		return candidateDTOs;
	}


	public void setCandidateDTOs(List<CandidateDTO> candidateDTOs) {
		this.candidateDTOs = candidateDTOs;
	}


	


}
