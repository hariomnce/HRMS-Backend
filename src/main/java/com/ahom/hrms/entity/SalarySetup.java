package com.ahom.hrms.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SalarySetup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String financialYear;
    private int employeeId;
    private String month;
    private String annualSalary;

    @ManyToOne
    private PayRoll payRoll;


}
