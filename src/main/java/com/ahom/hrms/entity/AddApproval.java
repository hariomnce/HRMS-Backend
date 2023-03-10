package com.ahom.hrms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "approval")
public class AddApproval {
	
	@Id
	private String userName;
	private String employeeName;
	private String approvalName;
	private String approvalCode;
	
	public AddApproval() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getApprovalName() {
		return approvalName;
	}

	public void setApprovalName(String approvalName) {
		this.approvalName = approvalName;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public AddApproval(String userName, String employeeName, String approvalName, String approvalCode) {
		super();
		this.userName = userName;
		this.employeeName = employeeName;
		this.approvalName = approvalName;
		this.approvalCode = approvalCode;
	}

	
}
