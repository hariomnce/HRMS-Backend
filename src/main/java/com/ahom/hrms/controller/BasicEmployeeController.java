package com.ahom.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahom.hrms.dto.BasicEmployeeDto;
import com.ahom.hrms.serviceimpl.BasicEmployeeServiceImpl;

@RestController
@CrossOrigin
public class BasicEmployeeController {

	@Autowired
	BasicEmployeeServiceImpl basicEmployeeService;

	//save data
	@PostMapping("/saveemployee")
	public ResponseEntity<BasicEmployeeDto> saveEmployees(@RequestBody BasicEmployeeDto basicEmployeeDto){
		basicEmployeeService.saveEmployee(basicEmployeeDto);
		return new ResponseEntity<>(basicEmployeeDto, HttpStatus.CREATED);
	}

	//fetch data
	@GetMapping("/fetchemployee/{employeeid}")
	public ResponseEntity<BasicEmployeeDto> getEmployee(@PathVariable("employeeid") Integer employeeId){
		BasicEmployeeDto basicEmployeeDto = basicEmployeeService.employeeById(employeeId);
		ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.ok(basicEmployeeDto);
	}

}
