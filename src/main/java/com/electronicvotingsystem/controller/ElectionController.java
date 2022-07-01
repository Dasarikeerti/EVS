package com.electronicvotingsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronicvotingsystem.entity.Election;
import com.electronicvotingsystem.exception.ElectionNotFoundException;
import com.electronicvotingsystem.model.ElectionDTO;
import com.electronicvotingsystem.service.ElectionService;

@RestController
public class ElectionController {
	
	@Autowired
	private ElectionService electionService;

	@PostMapping(value = "/addelection")
	public Election addElection(@RequestBody @Valid ElectionDTO electionDTO) {
		return electionService.addElection(electionDTO);
	}

	@GetMapping(value = "/viewelection/{id}")
	public ElectionDTO viewElection(@PathVariable("id") int electionId) throws ElectionNotFoundException {
		return electionService.viewElection(electionId);
	}

	@PutMapping(value = "/updateelection")
	public Election updateElection(@RequestBody @Valid ElectionDTO electionDTO) throws ElectionNotFoundException {
		return electionService.updateElection(electionDTO);
	}

	@DeleteMapping(value = "/deleteelection/{id}")
	public String deleteElection(@PathVariable("id") int id) throws ElectionNotFoundException {
		return electionService.deleteElection(id);
	}

}
