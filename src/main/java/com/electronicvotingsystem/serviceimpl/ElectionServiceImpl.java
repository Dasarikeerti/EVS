package com.electronicvotingsystem.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronicvotingsystem.entity.Election;
import com.electronicvotingsystem.exception.ElectionNotFoundException;
import com.electronicvotingsystem.model.ElectionDTO;
import com.electronicvotingsystem.repository.ElectionRepository;
import com.electronicvotingsystem.service.ElectionService;
import com.electronicvotingsystem.utils.ConversionClass;
@Service
public class ElectionServiceImpl implements ElectionService {

	@Autowired
	private ElectionRepository electionRepo;

	@Autowired
	private ConversionClass convertElection;

	@Override
	public Election addElection(ElectionDTO electionDto){

		return electionRepo.save(convertElection.convertToElectionEntity(electionDto));
	}

	@Override
	public List<Election> viewAllElection() {

		return electionRepo.findAll();
	}
	
	// viewElection

	@Override
	public ElectionDTO viewElection(int electionId) throws ElectionNotFoundException {

		Optional<Election> election = electionRepo.findById(electionId);
		ElectionDTO elecDto = null;
		Election elec = null;
		if(election.isPresent()) {
			elec = election.get();
			elecDto=convertElection.convertToElectionDTO(elec);
		}
		else
		{
			throw new ElectionNotFoundException("Election not Found");
		}
		return elecDto;	
	}
	
	//Update Election

	@Override
	public Election updateElection(ElectionDTO electionDTO) throws ElectionNotFoundException{
		Optional<Election> election = electionRepo.findById(electionDTO.getElectionId());
		Election electionRecord=null;
		if(election.isPresent()) {
			electionRecord= election.get();
			electionRepo.save(convertElection.convertToElectionEntity(electionDTO));

		}
		else {
			throw new ElectionNotFoundException("Election Not Found");
		}

		return electionRecord;
	}

	@Override
	public String deleteElection(int id) throws ElectionNotFoundException {
		Optional<Election> election = electionRepo.findById(id);
		String message = null;
		if (election.isPresent()) {
			electionRepo.deleteById(id);
			message = "election Deleted Successfully";

		} else {
			message = "No Election Found";
			throw new ElectionNotFoundException(message);
		}
		return message;
	}

}
