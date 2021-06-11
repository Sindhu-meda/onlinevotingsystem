package com.cg.society.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.society.entities.VotedList;
import com.cg.society.exception.VoteAlreadyCastException;
import com.cg.society.exception.VotedListNotFoundException;
import com.cg.society.exception.VoterIdNotFoundException;

@Service
public interface VotedListService {

	VotedList castVotedList(VotedList votedList) throws VoteAlreadyCastException;// vote is cast

	VotedList updateVotedListDetails(VotedList votedList);

	void deleteById(int id) throws VotedListNotFoundException;

	List<VotedList> viewVotedList();

	VotedList findById(int id) throws VoterIdNotFoundException;

	// List <VotedList> searchByNominatedCandidateId(int candidateId) throws
	// CandidateNotFoundException;

}
