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

import com.ahom.hrms.dto.AddHolidayDto;
import com.ahom.hrms.serviceimpl.AddHolidayServiceImpl;
@RestController
@CrossOrigin
public class AddHolidayController {
@Autowired
AddHolidayServiceImpl addHolidayService;
@PostMapping("/leaveDetail")
public ResponseEntity<AddHolidayDto>SaveAddHolidayDetail(@RequestBody AddHolidayDto addHolidayDto){
	addHolidayService.SaveAddHolidayDetail(addHolidayDto);
	return new ResponseEntity<>(addHolidayDto,HttpStatus.CREATED);
}
@GetMapping("/leaveDetails")
public List<AddHolidayDto> getAllJob(){
	List<AddHolidayDto>allJob=addHolidayService.getAllLeaveDetail();
	return allJob; 
}
@DeleteMapping("/leaveDetail/{deletei}")
	public void delete(@PathVariable ("deletei")int i) {
	addHolidayService.deleteLaeveDetail(i);
	
} 
@PutMapping("/edit")
public ResponseEntity<AddHolidayDto>updateall(@RequestBody AddHolidayDto addHolidayDto){
	addHolidayService.updateLeaveDetail(addHolidayDto);
return new ResponseEntity<>(addHolidayDto,HttpStatus.CREATED);	
}

}
