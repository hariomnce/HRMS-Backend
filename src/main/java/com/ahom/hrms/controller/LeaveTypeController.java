package com.ahom.hrms.controller;

import java.util.List;

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

import com.ahom.hrms.dto.LeaveTypeDto;
import com.ahom.hrms.entity.LeaveType;
import com.ahom.hrms.serviceimpl.LeaveTypeServiceImpl;
@RestController
@CrossOrigin
public class LeaveTypeController {
	@Autowired
	LeaveTypeServiceImpl leaveTypeService;
	@PostMapping("/LeaveType")
	public ResponseEntity<LeaveTypeDto>SaveLeaveTypeDetail(@RequestBody LeaveTypeDto leaveTypeDto){
		leaveTypeService.SaveLeaveTypeDetail(leaveTypeDto);
		return new ResponseEntity<>(leaveTypeDto,HttpStatus.CREATED);
	 }
	@GetMapping("/LeaveType")
	public List<LeaveTypeDto> getAll(){
		List<LeaveTypeDto>alljob=leaveTypeService.getAllLeaveDetail();
		return alljob; 
	}
	@DeleteMapping("/leavetype/{deletei}")
	public void delete(@PathVariable ("deletei")int i) {
	leaveTypeService.deleteLaeveDetail(i);
	
} 

	//@PutMapping("/edit")
	//public ResponseEntity<LeaveTypeDto>updateallEntity(@RequestBody LeaveTypeDto leaveTypeDto){
	//leaveTypeService.updateLeaveType(leaveTypeDto);
	//	return new ResponseEntity<>(leaveTypeDto,HttpStatus.CREATED);	

}