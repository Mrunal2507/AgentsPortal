package com.cg.assignment.dto;

public class LeadResponseDTO {

	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String emailAddress;
	private String dateOfBirth;
	private String gender;
	private String doYouSmoke;
	private String doYouConsumeAlcohol;
	private String address;
	private int birthday;
	
	
	public LeadResponseDTO(String firstName, String lastName, int phoneNumber, String emailAddress, String dateOfBirth,
			String gender, String doYouSmoke, String doYouConsumeAlcohol, String address, int birthday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.doYouSmoke = doYouSmoke;
		this.doYouConsumeAlcohol = doYouConsumeAlcohol;
		this.address = address;
		this.birthday = birthday;
	}

}
