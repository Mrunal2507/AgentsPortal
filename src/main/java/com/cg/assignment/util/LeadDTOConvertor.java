package com.cg.assignment.util;

import org.springframework.stereotype.Component;

import com.cg.assignment.dto.LeadResponseDTO;
import com.cg.assignment.entity.Agent;


@Component
public class LeadDTOConvertor {

	public LeadResponseDTO convertTo(Agent agent) {
		return new LeadResponseDTO(agent.getFirstName(),agent.getLastName(),agent.getPhoneNumber(),agent.getEmailAddress(),agent.getDateOfBirth(),agent.getGender(),agent.getDoYouSmoke(),agent.getDoYouConsumeAlcohol(),agent.getAddress(),agent.getBirthday());
	}
}