package com.cg.society.controller;


import java.util.List;

import javax.validation.Valid;

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

import com.cg.society.entities.ElectionResult;
import com.cg.society.service.ElectionResultServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

@RestController // controller nd responsebody

// json -> javascript object notation which stores data  nd transporting of data.
@RequestMapping("/ElectionResult")

public class ElectionResultController {
	@Autowired
	private ElectionResultServiceImpl service; // ElectionResultService is a dependency

	@GetMapping("/getById{id}")
	@ApiOperation("Get ElectionResult By Id")
	public ElectionResult FetchById(@PathVariable String id) {
		return service.viewCandidatewiseResult(Integer.valueOf(id));

	}

	@GetMapping("/getAll")
	@ApiOperation("Fetch all ElectionResult by Details")
	public List<ElectionResult> fetch() {
		return service.viewElectionResultList();

	}

	@PostMapping("/save")
	
	public ResponseEntity<ElectionResult> save(@Valid @RequestBody ElectionResult result) {
        //logger.info("Adding a result : " + electionresult);
        ElectionResult doc = service.addElectionResult(result);
        return new ResponseEntity<>(doc, HttpStatus.CREATED);
    }

	
	}

