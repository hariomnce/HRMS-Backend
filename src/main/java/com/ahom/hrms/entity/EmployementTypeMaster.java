package com.ahom.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employment_type_master")
public class EmployementTypeMaster {
	
	@Id
	private String employmentType;
	private String description;
	
	public EmployementTypeMaster() {
		
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EmployementTypeMaster(String employmentType, String description) {
		super();
		this.employmentType = employmentType;
		this.description = description;
	}
	

}
