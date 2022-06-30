package com.electronicvotingsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronicvotingsystem.entity.ElectoralOfficer;
import com.electronicvotingsystem.model.ElectoralOfficerDTO;
import com.electronicvotingsystem.repository.ElectoralOfficerRepository;
import com.electronicvotingsystem.repository.UserRepository;
import com.electronicvotingsystem.service.ElectoralOfficerService;
import com.electronicvotingsystem.utils.ConversionClass;
@Service
public class ElectoralOfficerServiceImpl implements ElectoralOfficerService {

	@Autowired
	ElectoralOfficerRepository electoralOfficerRepository;
	
	@Autowired
	private ConversionClass convertelectoralOfficerRepo ;
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public String registerElectoralOfficer(ElectoralOfficerDTO electoralOfficerDTO) throws UserAlreadyExistsException{
		
		String message=null;
		ElectoralOfficer electoralOfficer = null;
		 if(this.userRepo.existsByUserName(electoralOfficerDTO.getUserName())) {
		        throw new UserAlreadyExistsException("User with given userName already exist");
		 }
		 electoralOfficer = electoralOfficerRepository.save(convertelectoralOfficerRepo.convertToElectoralOfficerEntity(electoralOfficerDTO));
		 if(electoralOfficer!=null) {
		 message="register Successfull";
		 }
		 return message;
	}

	
}
