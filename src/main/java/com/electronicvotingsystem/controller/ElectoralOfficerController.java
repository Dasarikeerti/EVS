package com.electronicvotingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.electronicvotingsystem.exception.ElectoralOfficerAlreadyExistsException;
import com.electronicvotingsystem.model.ElectoralOfficerDTO;
import com.electronicvotingsystem.service.ElectoralOfficerService;
import com.electronicvotingsystem.serviceimpl.UserAlreadyExistsException;

@RestController
@CrossOrigin(origins = "http://localhost",maxAge = 3600)
public class ElectoralOfficerController {

	@Autowired
	private  ElectoralOfficerService electoralOfficerService;
	
	@PostMapping(value = "/registerelectofficer")
	public String RegisterElectoralOfficer(@RequestBody ElectoralOfficerDTO electoralOfficerDTO)throws ElectoralOfficerAlreadyExistsException, UserAlreadyExistsException
	{
		//System.out.println(electoralOfficerDTO.getDateOfBirth().getClass().getName());
		return electoralOfficerService.registerElectoralOfficer(electoralOfficerDTO);
	}
	
}
