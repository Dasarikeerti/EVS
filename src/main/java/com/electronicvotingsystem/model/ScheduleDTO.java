package com.electronicvotingsystem.model;

import java.sql.Date;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class ScheduleDTO {
	
	private int scheduleId;

	@NotNull
	private String electionName;

	@NotNull
	private String state;

	@NotNull
	private String constituency;

	private Date electionDate;

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
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

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public Date getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(Date electionDate) {
		this.electionDate = electionDate;
	}
	
}
