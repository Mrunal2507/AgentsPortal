package com.cg.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.assignment.dto.LeadResponseDTO;
import com.cg.assignment.entity.Agent;
import com.cg.assignment.service.ILeadService;
import com.cg.assignment.util.LeadDTOConvertor;


@RestController
@Controller
@RequestMapping("/lead")
public class LeadRestController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ILeadService leadService;
	
	@Autowired
	LeadDTOConvertor dtoConvertor;
	
	public LeadRestController() {
		logger.info(" Lead Rest Controller Called");
		System.err.println("-------Lead Rest Controller Called-------");
	}
	
	@PostMapping("/addLead")
	public ResponseEntity<LeadResponseDTO> saveLead(@RequestBody Agent agent){
		System.err.println("post mapping "+agent);
		Agent savedLead = leadService.addNewLead(agent);
		logger.info("Lead Saved "+savedLead);
		
		LeadResponseDTO dto = dtoConvertor.convertTo(savedLead);
		return new ResponseEntity<LeadResponseDTO>(dto, HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<LeadResponseDTO>> getAllLeads() {

		List<Agent> allLeads = leadService.getAllLeads();
		List<LeadResponseDTO> dtoList = new ArrayList<>();

		for (Agent agent : allLeads) {

			LeadResponseDTO dtoObj = dtoConvertor.convertTo(agent);
			dtoList.add(dtoObj);
		}
		return new ResponseEntity<List<LeadResponseDTO>>(dtoList, HttpStatus.OK);
	}
}
