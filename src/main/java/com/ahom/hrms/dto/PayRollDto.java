package com.ahom.hrms.dto;

import java.util.ArrayList;
import java.util.List;

import com.ahom.hrms.entity.Allowances;
import com.ahom.hrms.entity.Deduction;
import com.ahom.hrms.entity.EmployeeDeduction;
import com.ahom.hrms.entity.Payroll_Item;
import com.ahom.hrms.entity.SalarySetup;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PayRollDto {
	private int id;
	private String refNo;
	private String dateFrom;
	private String dateTo;
	private String type;
	private String status;
	private String dateCreated;

	private List<Allowances> allowances;
	private List<Deduction> deduction = new ArrayList<>();
	private List<EmployeeDeduction> deductions = new ArrayList<>();
	private List<Payroll_Item> payroll_items;
	private  List<SalarySetup>  salarySetups;
}
