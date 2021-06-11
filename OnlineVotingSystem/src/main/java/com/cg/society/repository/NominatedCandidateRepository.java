package com.cg.society.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.society.entities.NominatedCandidate;
import com.cg.society.exception.NominatedCandidateNotFoundException;

public interface NominatedCandidateRepository extends JpaRepository<NominatedCandidate, Integer>
{
	
}
