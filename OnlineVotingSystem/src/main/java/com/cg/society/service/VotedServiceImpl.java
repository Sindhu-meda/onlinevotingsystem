package com.cg.society.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.society.entities.VotedList;
import com.cg.society.exception.VoteAlreadyCastException;
import com.cg.society.exception.VotedListNotFoundException;
import com.cg.society.exception.VoterIdNotFoundException;
import com.cg.society.repository.VotedListRepository;

@Service
public class VotedServiceImpl implements VotedListService {

	Logger logger = LoggerFactory.getLogger(VotedServiceImpl.class);

	@Autowired
	private VotedListRepository repository;

	@Override
	public VotedList castVotedList(VotedList votedList) throws VoteAlreadyCastException {
		// if (RegisteredSocietyVoters.castedVote==true)
		// throw new VoteAlreadyCastException();

		return repository.save(votedList);

	}

	@Override
	public VotedList updateVotedListDetails(VotedList votedList) {//
		return repository.save(votedList);

	}

	@Override
	public void deleteById(int id) throws VotedListNotFoundException {

		Optional<VotedList> votedList = repository.findById(id);
		if (!votedList.isPresent())
			throw new VotedListNotFoundException();

		repository.deleteById(id);

	}

	@Override
	public List<VotedList> viewVotedList() {

		return repository.findAll();
	}

	@Override
	 public VotedList findById(int id) throws VoterIdNotFoundException {

		Optional<VotedList> votedList = repository.findById(id);
		if (!votedList.isPresent())
			throw new VoterIdNotFoundException();

		return votedList.get();
	}

	/*
	 * @Override public List<VotedList> searchByNominatedCandidateId(int
	 * candidateId) throws CandidateNotFoundException { Optional<VotedList>
	 * votedList = repository.findById(candidateId); if (!votedList.isPresent())
	 * throw new CandidateNotFoundException();
	 * 
	 * return (List<VotedList>) votedList.get(); }
	 */

}
