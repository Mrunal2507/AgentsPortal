package com.cg.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.assignment.entity.Agent;

@Service
public interface ILeadService {

	public Agent addNewLead(Agent agent);
	
	public List<Agent> getAllLeads();
}
