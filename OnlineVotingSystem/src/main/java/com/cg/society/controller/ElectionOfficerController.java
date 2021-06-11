package com.cg.society.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.cg.society.entities.ElectionOfficer;
import com.cg.society.exception.ElectionOfficerDetailsNotFoundException;
import com.cg.society.service.IElectionOfficerService;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/ElectionOfficer")

public class ElectionOfficerController 
{
	Logger logger = LoggerFactory.getLogger(ElectionOfficerController .class);
	@Autowired
	private IElectionOfficerService service;

	@GetMapping("/{name}")
	@ApiOperation("Greetings API")
	public String greetings(@PathVariable String name)
	{
		logger.info("Inside greetings!!");
		return "<h1>Welcome to Spring Boot " + name + "</h1>";
	}
	
	@GetMapping("/getById/{id}")
	@ApiOperation("Get ElectionOfficer By ID")
	public ElectionOfficer fetchById(@PathVariable int id) throws NumberFormatException, ElectionOfficerDetailsNotFoundException
	{
		logger.info("Inside fetchById %s", id);
		return service.fetchById(id);
	}
	
	@GetMapping("/getAll")
	@ApiOperation("Fetch all ElectionOfficer Details")
	public List<ElectionOfficer> fetch() {
		logger.info("Fetching all ElectionOfficer records!!");
		return service.fetchAll();
	}
	@PostMapping("/save")
	@ApiOperation("Add a ElectionOfficer details")
	public ResponseEntity<ElectionOfficer> save(@Valid @RequestBody ElectionOfficer electionofficer) {
		logger.info("Adding a electionofficer : " + electionofficer);
		ElectionOfficer e = service.addElectionOfficer(electionofficer);
		return new ResponseEntity<>(e, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	@ApiOperation("Update an Existing ElectionOfficer details")
	public void update(@Valid @RequestBody ElectionOfficer electionofficer) {
		logger.info("Updating a ElectionOfficerDetails!!");
		service.updateElectionOfficer(electionofficer);
	}

	@DeleteMapping("/delete/{id}")
	@ApiOperation("Delete an Existing ElectionOfficer details")
	public ResponseEntity<Void> delete(@PathVariable int id) throws ElectionOfficerDetailsNotFoundException {
		logger.info("Deleting a ElectionOfficerDetails!!");
		service.deleteElectionOfficer(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
