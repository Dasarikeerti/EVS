package com.electronicvotingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.electronicvotingsystem.exception.ElectoralOfficerAlreadyExistsException;
import com.electronicvotingsystem.exception.UserAlreadyExistsException;
import com.electronicvotingsystem.model.ElectoralOfficerDTO;
import com.electronicvotingsystem.service.ElectoralOfficerService;

@RestController
public class ElectoralOfficerController {

	@Autowired
	private  ElectoralOfficerService electoralOfficerService;
	
	@PostMapping(value = "/registerelectofficer")
	public String RegisterElectoralOfficer(@RequestBody ElectoralOfficerDTO electoralOfficerDTO)throws ElectoralOfficerAlreadyExistsException, UserAlreadyExistsException
	{
		return electoralOfficerService.registerElectoralOfficer(electoralOfficerDTO);
	}
	
}
