package com.electronicvotingsystem.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Candidate extends User{
	
	private int age;

	@ManyToOne
	@JsonIgnore
	private Election election;

	@NotNull
	private String constituency;

	private long votecount;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Election getElection() {
		return election;
	}

	public void setElection(Election election) {
		this.election = election;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public long getVotecount() {
		return votecount;
	}

	public void setVotecount(long votecount) {
		this.votecount = votecount;
	}
	
}
