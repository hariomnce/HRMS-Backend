package com.ahom.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "add_department")
public class AddDepartment {
	
	@Id
	private int departmentId;
	private String departmentName;
	private String description;
	
	public AddDepartment() {
		
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AddDepartment(int departmentId, String departmentName, String description) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.description = description;
	}
	

}
