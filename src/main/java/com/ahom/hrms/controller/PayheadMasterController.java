package com.ahom.hrms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahom.hrms.dto.PayheadMasterDto;
import com.ahom.hrms.serviceimpl.PayheadMasterServiceImpl;
@RestController
@CrossOrigin
public class PayheadMasterController {
@Autowired
PayheadMasterServiceImpl payheadMasterService;
@PostMapping("/PayheadMaster")
public ResponseEntity<PayheadMasterDto>SaveLeaveTypeDetail( @Valid @RequestBody PayheadMasterDto payheadMasterDto){
	payheadMasterService.SavePayheadMaster(payheadMasterDto);
	return new ResponseEntity<>(payheadMasterDto,HttpStatus.CREATED);
 }
@GetMapping("/PayheadMasterDetail")
public List<PayheadMasterDto>getAll(){
	List<PayheadMasterDto>all=payheadMasterService.getpayheadMasterDetail();
	return all;
	
}
@DeleteMapping("/deletepayheadmaster/{deletei}")
public void delete(@PathVariable("deletei") int i) {
	payheadMasterService.deletepayheadmasterDetail(i);
}
@PutMapping("/updatepayheadmMaster")
public ResponseEntity<PayheadMasterDto>updateall(@RequestBody PayheadMasterDto payheadMasterDto) {
	payheadMasterService.updatpayheadMaster(payheadMasterDto);
	return new ResponseEntity<>(payheadMasterDto,HttpStatus.CREATED);
}
}