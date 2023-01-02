package com.ahom.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDeductionDto {

	private int Id;
	private int empId;
	private int deductionId;
	private String type;
	private double ammount;
	private String effectiveDate;
	private String dateCreated;

}


	
	


