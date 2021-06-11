package com.cg.society.service;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.society.entities.ElectionOfficer;
import com.cg.society.exception.ElectionOfficerDetailsNotFoundException;
import com.cg.society.repository.ElectionOfficeRepository;
import com.cg.society.service.ElectionOfficerServiceImpl;
@Service
public class ElectionOfficerServiceImpl implements IElectionOfficerService
{
	Logger logger = LoggerFactory.getLogger(ElectionOfficerServiceImpl.class);
	@Autowired
	private ElectionOfficeRepository repository ;
	@Override
	public ElectionOfficer addElectionOfficer(ElectionOfficer electionofficer)
	{
		logger.info("inside addElectionOfficeDetails method of ElectionOfficerServiceImpl");
		return repository.save(electionofficer);
		
	}
	@Override
	public List<ElectionOfficer> fetchAll()
	{
		return repository.findAll();
	}
	@Override
	public void updateElectionOfficer(ElectionOfficer electionofficer)
	{
		repository.save(electionofficer);
	}
	@Override
	public ElectionOfficer fetchById(int id) throws ElectionOfficerDetailsNotFoundException
	{
		Optional<ElectionOfficer> electionofficer = repository.findById(id);
		if (!electionofficer.isPresent())
			throw new ElectionOfficerDetailsNotFoundException();

		return electionofficer.get();
	}
	@Override
	public  void deleteElectionOfficer(int id) throws ElectionOfficerDetailsNotFoundException 
	{
		Optional<ElectionOfficer> electionofficer = repository.findById(id);
		if (!electionofficer.isPresent())
			throw new ElectionOfficerDetailsNotFoundException ();

	    repository.deleteById(id); 
	
	}
	
	
	}
	
	
	
