package com.ahom.hrms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahom.hrms.dto.DesignationMasterDto;
import com.ahom.hrms.serviceimpl.DesignationMasterServiceImpl;


@RestController
@CrossOrigin
public class DesignationMasterController {

	@Autowired
	DesignationMasterServiceImpl designationMasterService;

	//save data
	@PostMapping("/savedesignation")
	public ResponseEntity<DesignationMasterDto> saveDesignation(@RequestBody DesignationMasterDto designationMasterDto){
		designationMasterService.saveDesignation(designationMasterDto);
		return new ResponseEntity<>(designationMasterDto, HttpStatus.CREATED);
	}

	//fetch all data from database
	@GetMapping("/fetchalldesignation")
	public ResponseEntity<List<DesignationMasterDto>> getDesignation(){
		List<DesignationMasterDto> allEmployee = designationMasterService.getAllEmployee();
		ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.of(Optional.of(allEmployee));
	}

}
