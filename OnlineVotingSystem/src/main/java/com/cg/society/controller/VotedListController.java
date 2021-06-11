
package com.cg.society.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.society.entities.VotedList;
import com.cg.society.exception.VotedListNotFoundException;
import com.cg.society.exception.VoterIdNotFoundException;
import com.cg.society.repository.VotedListRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/VotedList")
public class VotedListController {

	Logger logger = LoggerFactory.getLogger(VotedListController.class);

	@Autowired
	private VotedListRepository service;

	//private registeredSocietVoters variable name  
	//@GetMapping 
	@PostMapping("/save")
	public void castVotedList(@Valid @RequestBody VotedList votedList) {
		service.save(votedList);

	}
//
//	@PutMapping("/update")
//	public VotedList updateVotedListDetails(@Valid @RequestBody VotedList votedList) {
//		return (VotedList) service.save(votedList);
//	}
//
//	@DeleteMapping("/delete/{id}")
//	@ApiOperation("Delete Voted List Details")
//	public void deletedVotedListDetails(@PathVariable int id) throws VotedListNotFoundException {
//		service.deleteById(id);
//	}

	@GetMapping("/getAll")
	@ApiOperation("Fetch all Voted List")
	public List<VotedList> viewVotedList() {
		return service.findAll();

	}
}

