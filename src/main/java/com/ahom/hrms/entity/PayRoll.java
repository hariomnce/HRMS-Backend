package com.ahom.hrms.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name="Pay_Roll")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PayRoll {
	@Id
	private int id;
	private String refNo;
	private String dateFrom;
	private String dateTo;
	private String type;
	private String status;
	private String dateCreated;
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "payRoll")
	private List<Allowances> allowances;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "payRoll", fetch = FetchType.LAZY)
	private List<Deduction> deduction = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "payRoll", fetch = FetchType.LAZY)
	private List<EmployeeDeduction> deductions = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payRoll", fetch = FetchType.LAZY)
	private List<Payroll_Item> payroll_items;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "payRoll", fetch = FetchType.LAZY)
	private  List<SalarySetup>  salarySetups;
}