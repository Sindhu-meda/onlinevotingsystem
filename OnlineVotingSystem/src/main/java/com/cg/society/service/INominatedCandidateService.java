package com.cg.society.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.society.entities.NominatedCandidate;

import com.cg.society.exception.NominatedCandidateNotFoundException;

@Service
public interface INominatedCandidateService 
{
	NominatedCandidate addNominatedCandidate(NominatedCandidate  nominatedcandidate);

    List<NominatedCandidate> fetchAll();
    
   void updateNominatedCandidate(NominatedCandidate nominatedcandidate);

   NominatedCandidate fetchById(int id) throws NominatedCandidateNotFoundException;

   void deleteNominatedCandidate(int id) throws NominatedCandidateNotFoundException;


}
