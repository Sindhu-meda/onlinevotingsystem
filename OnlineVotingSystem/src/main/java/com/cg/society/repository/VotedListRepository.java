package com.cg.society.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.society.entities.VotedList;

@Repository
public interface VotedListRepository extends JpaRepository<VotedList, Integer> {

	//@Query("SELECT v FROM VotedList v WHERE v.getVoter().getVoterIdCardNo()=:voterIdCardNo")
	//Optional<VotedList> searchByVoterIdCardNo(@Param("voterIdCardNo") int voterIdCardNo);

	// void updateVotedList(int voterIdCardNo);

	// void saveAll(@Valid int voterIdCardNo);

//	public void castVotedList(VotedList votedList);

	// public void updateVotedListDetails(VotedList votedList);

	// public void deletedVotedListDetails(int id);

	// public List<VotedList> findAll();

	// public VotedList searchByVoterId(int voterIdCardNo);

	// public List<VotedList> findByNominatedCandidate(int candidateId);
	// Query is left

}
