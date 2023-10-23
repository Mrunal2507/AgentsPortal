package com.cg.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignment.entity.Agent;
import com.cg.assignment.repository.ILeadRepository;

@Service
public class ILeadServiceImpl implements ILeadService {
	
	@Autowired
	private ILeadRepository leadRepository;

	@Override
	public Agent addNewLead(Agent agent) {
		// TODO Auto-generated method stub
		return leadRepository.save(agent);
	}

	@Override
	public List<Agent> getAllLeads() {
		// TODO Auto-generated method stub
		return leadRepository.findAll();
	}

}
