package com.example.electronicvotingsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.electronicvotingsystem.entity.Party;
import com.example.electronicvotingsystem.exception.PartyNotFoundException;
import com.example.electronicvotingsystem.model.PartyDTO;
import com.example.electronicvotingsystem.service.PartyService;

@RestController
@RequestMapping("/api/parties")
public class PartyController
{
 private  PartyService partyservice;

public PartyController(PartyService partyservice) 
{
	super();
	this.partyservice = partyservice;
}
 
 //build create party
@PostMapping(value="/saveparty")
public ResponseEntity<Party>saveParty(@RequestBody Party party)
{
	return new ResponseEntity<Party>(partyservice.saveParty(party),HttpStatus.CREATED);
}


@PostMapping(value = "/addparty")
public Party addParty(@RequestBody @Valid PartyDTO partyDTO) {
	return partyservice.addParty(partyDTO);
}

@GetMapping(value = "/viewparty/{id}")
public PartyDTO viewParty(@PathVariable("id") int partyId) throws PartyNotFoundException{
	return partyservice.viewParty(partyId);
}


//deleteParty
@DeleteMapping(value = "/deleteparty/{id}")
public String deleteParty(@PathVariable("id") int partyId) throws PartyNotFoundException {
	return partyservice.deleteParty(partyId);
}


//updateParty
@PutMapping(value = "/updateparty")
public Party modifyParty(@RequestBody @Valid  PartyDTO partyDto) throws PartyNotFoundException{
	return partyservice.updateParty(partyDto);
}



@GetMapping(value = "/viewallparty")
public List<Party> viewAllParty() {
	return partyservice.viewAllParty();
}

}
