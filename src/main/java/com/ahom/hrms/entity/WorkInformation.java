package com.ahom.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "work_info")
public class WorkInformation {
	
	@Id
	private String employementType;
	private String officeBranch;
	private String employeeGrade;
	private String employeeGroup;
	private String insuranceAvil;
	private String gender;
	private String bloodGroup;
	private long incentive;
	private String employeeType;
	private int value;
	private String effectiveDate;
	private String pfAccountNo;
	private String esiNo;
	private String cinNo;
	private String leavingDate;
	private String address;
	private String description;

	public WorkInformation() {
		
	}

	public String getEmployementType() {
		return employementType;
	}

	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	public String getOfficeBranch() {
		return officeBranch;
	}

	public void setOfficeBranch(String officeBranch) {
		this.officeBranch = officeBranch;
	}

	public String getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public String getEmployeeGroup() {
		return employeeGroup;
	}

	public void setEmployeeGroup(String employeeGroup) {
		this.employeeGroup = employeeGroup;
	}

	public String getInsuranceAvil() {
		return insuranceAvil;
	}

	public void setInsuranceAvil(String insuranceAvil) {
		this.insuranceAvil = insuranceAvil;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getIncentive() {
		return incentive;
	}

	public void setIncentive(long incentive) {
		this.incentive = incentive;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPfAccountNo() {
		return pfAccountNo;
	}

	public void setPfAccountNo(String pfAccountNo) {
		this.pfAccountNo = pfAccountNo;
	}

	public String getEsiNo() {
		return esiNo;
	}

	public void setEsiNo(String esiNo) {
		this.esiNo = esiNo;
	}

	public String getCinNo() {
		return cinNo;
	}

	public void setCinNo(String cinNo) {
		this.cinNo = cinNo;
	}

	public String getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(String leavingDate) {
		this.leavingDate = leavingDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public WorkInformation(String employementType, String officeBranch, String employeeGrade, String employeeGroup,
			String insuranceAvil, String gender, String bloodGroup, long incentive, String employeeType, int value,
			String effectiveDate, String pfAccountNo, String esiNo, String cinNo, String leavingDate, String address,
			String description) {
		super();
		this.employementType = employementType;
		this.officeBranch = officeBranch;
		this.employeeGrade = employeeGrade;
		this.employeeGroup = employeeGroup;
		this.insuranceAvil = insuranceAvil;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.incentive = incentive;
		this.employeeType = employeeType;
		this.value = value;
		this.effectiveDate = effectiveDate;
		this.pfAccountNo = pfAccountNo;
		this.esiNo = esiNo;
		this.cinNo = cinNo;
		this.leavingDate = leavingDate;
		this.address = address;
		this.description = description;
	}

	
	
}
