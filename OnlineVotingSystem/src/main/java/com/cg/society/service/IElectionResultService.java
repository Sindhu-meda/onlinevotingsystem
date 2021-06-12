package com.cg.society.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.society.entities.ElectionResult;


@Service
public interface IElectionResultService {

	ElectionResult addElectionResult(ElectionResult result);
	List<ElectionResult>viewElectionResultList();
	ElectionResult viewCandidatewiseResult(int candidateId);
	//public double viewVotingPercentage(double vpr);
	//double viewCandidateVotingPercentage(int candidateId);
	//void displayVotingStatistics();
	//NominatedCandidates viewHighestVotingPercentCandidate();
	//NominatedCandidates viewLowestVotingPercentCandidate();
	//int viewinvalidVotes();
	//List<NominatedCandidates> candidatewiseinvalidVotesList();
	//void displayPollingResult();
}
