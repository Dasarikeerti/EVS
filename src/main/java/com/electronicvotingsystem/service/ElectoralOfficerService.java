package com.electronicvotingsystem.service;

import com.electronicvotingsystem.exception.UserAlreadyExistsException;
import com.electronicvotingsystem.model.ElectoralOfficerDTO;

public interface ElectoralOfficerService {

	// add electoral officer
	public String registerElectoralOfficer(ElectoralOfficerDTO electoralOfficerDTO) throws UserAlreadyExistsException;
		

}
