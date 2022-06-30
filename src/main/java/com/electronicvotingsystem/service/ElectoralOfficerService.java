package com.electronicvotingsystem.service;

import com.electronicvotingsystem.model.ElectoralOfficerDTO;
import com.electronicvotingsystem.serviceimpl.UserAlreadyExistsException;

public interface ElectoralOfficerService {

	// add electoral officer
	public String registerElectoralOfficer(ElectoralOfficerDTO electoralOfficerDTO) throws UserAlreadyExistsException;
		

}
