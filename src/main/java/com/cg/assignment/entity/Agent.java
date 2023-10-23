package com.cg.assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agent {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int leadId;
		
		private String firstName;
		private String lastName;
		private int phoneNumber;
		private String emailAddress;
		private String dateOfBirth;
		private int pincode;
		private String gender;
		private String doYouSmoke;
		private String doYouConsumeAlcohol;
		private String address;
		private int birthday;
		private String addDependents;
		private String annualIncome;
		private int money1;
		private int money2;
		private String identityName;
		private String financialName;
		
		public Agent() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Agent(String firstName, String lastName, int phoneNumber, String emailAddress, String dateOfBirth,
				int pincode, String gender, String doYouSmoke, String doYouConsumeAlcohol, String address, int birthday,
				String addDependents, String annualIncome, int money1, int money2, String identityName,
				String financialName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.emailAddress = emailAddress;
			this.dateOfBirth = dateOfBirth;
			this.pincode = pincode;
			this.gender = gender;
			this.doYouSmoke = doYouSmoke;
			this.doYouConsumeAlcohol = doYouConsumeAlcohol;
			this.address = address;
			this.birthday = birthday;
			this.addDependents = addDependents;
			this.annualIncome = annualIncome;
			this.money1 = money1;
			this.money2 = money2;
			this.identityName = identityName;
			this.financialName = financialName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDoYouSmoke() {
			return doYouSmoke;
		}

		public void setDoYouSmoke(String doYouSmoke) {
			this.doYouSmoke = doYouSmoke;
		}

		public String getDoYouConsumeAlcohol() {
			return doYouConsumeAlcohol;
		}

		public void setDoYouConsumeAlcohol(String doYouConsumeAlcohol) {
			this.doYouConsumeAlcohol = doYouConsumeAlcohol;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getBirthday() {
			return birthday;
		}

		public void setBirthday(int birthday) {
			this.birthday = birthday;
		}

		public String getAddDependents() {
			return addDependents;
		}

		public void setAddDependents(String addDependents) {
			this.addDependents = addDependents;
		}

		public String getAnnualIncome() {
			return annualIncome;
		}

		public void setAnnualIncome(String annualIncome) {
			this.annualIncome = annualIncome;
		}

		public int getMoney1() {
			return money1;
		}

		public void setMoney1(int money1) {
			this.money1 = money1;
		}

		public int getMoney2() {
			return money2;
		}

		public void setMoney2(int money2) {
			this.money2 = money2;
		}

		public String getIdentityName() {
			return identityName;
		}

		public void setIdentityName(String identityName) {
			this.identityName = identityName;
		}

		public String getFinancialName() {
			return financialName;
		}

		public void setFinancialName(String financialName) {
			this.financialName = financialName;
		}

}
