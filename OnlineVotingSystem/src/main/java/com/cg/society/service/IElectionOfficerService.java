package com.cg.society.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.society.exception.ElectionOfficerDetailsNotFoundException;
import com.cg.society.entities.ElectionOfficer;
@Service
public interface IElectionOfficerService
{
	ElectionOfficer addElectionOfficer(ElectionOfficer  electionofficer);

     List<ElectionOfficer> fetchAll();
     
    void updateElectionOfficer(ElectionOfficer customer);
    
    void deleteElectionOfficer(int id) throws ElectionOfficerDetailsNotFoundException;

 	ElectionOfficer fetchById(int id) throws ElectionOfficerDetailsNotFoundException;


	
}
