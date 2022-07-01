package com.electronicvotingsystem.entity;


import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
public class ElectoralOfficer extends User {
	
	@NotNull
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	
}
