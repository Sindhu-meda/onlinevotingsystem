package com.cg.society.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.society.entities.ElectionResult;


@Repository
public interface ElectionResultRepository extends JpaRepository<ElectionResult, Integer> {

	
	//public double viewVotingPercentage();

	/*void displayVotingStatistics();

	double viewCandidateVotingPercentage(int candidateId);

	double viewVotingPercentage();

	int viewCandidatewiseResult(int candidateId);

	NominatedCandidates viewHighestVotingPercentCandidate();

	NominatedCandidates viewLowestVotingPercentCandidate();

	int viewinvalidVotes();

	List<NominatedCandidates> viewcandidatewiseinvalidVotesList();

	 void displayPollingResult();*/

}
