package com.cg.society.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.society.entities.ElectionOfficer;
import com.cg.society.exception.ElectionOfficerDetailsNotFoundException;
import com.cg.society.entities.ElectionOfficer;

public interface ElectionOfficeRepository extends JpaRepository<ElectionOfficer, Integer>
{
	public ElectionOfficer findByLastName(String lastName);

	public ElectionOfficer findByFirstName(String firstName);
	
}
