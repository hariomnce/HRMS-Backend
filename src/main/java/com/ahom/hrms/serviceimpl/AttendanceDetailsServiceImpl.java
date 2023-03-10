package com.ahom.hrms.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.dao.AttendanceDetailsRepository;
import com.ahom.hrms.dto.AttendanceDetailsDto;
import com.ahom.hrms.entity.AttendanceDetails;
import com.ahom.hrms.service.AttendanceDetailsService;

@Service
public class AttendanceDetailsServiceImpl implements AttendanceDetailsService {

	@Autowired
	AttendanceDetailsRepository attendanceDetailsRepository;

	//save data
	@Override
	public void saveAttendanceDetails(AttendanceDetailsDto attendanceDetailsDto)
	{
		attendanceDetailsRepository.save(attendanceDetailsdtotoAttendanceDetails(attendanceDetailsDto));

	}

	@Override
	public List<AttendanceDetailsDto> getAllAttendanceDetails(){

		List<AttendanceDetails> listAttendanceDetails= this.attendanceDetailsRepository.findAll();
		List<AttendanceDetailsDto> attendanceDetialsDtoList = listAttendanceDetails.stream().map(emp -> this.attendanceDetailstoattendanceDetailsDto(emp)).collect(Collectors.toList());
		return attendanceDetialsDtoList ;

	}	
	//delete data
//	public void deleteAttendanceDetails(int empId){
//
//		attendanceDetailsRepository.deleteById(empId);
//
//	}
	//update data
	@Override
	public AttendanceDetailsDto updateAttendanceDetails(AttendanceDetailsDto attendanceDetailsDto)
	{
		attendanceDetailsRepository.save(attendanceDetailsdtotoAttendanceDetails(attendanceDetailsDto));
		return attendanceDetailsDto;

	}



	public AttendanceDetails attendanceDetailsdtotoAttendanceDetails(AttendanceDetailsDto attendanceDetailsDto)
	{
		AttendanceDetails attendanceDetails=new AttendanceDetails();

		
		attendanceDetails.setFromDate(attendanceDetailsDto.getFromDate());
		attendanceDetails.setSelectEmployee(attendanceDetailsDto.getSelectEmployee());
		
		attendanceDetails.setToDate(attendanceDetailsDto.getToDate());


		return attendanceDetails;
	}

	public AttendanceDetailsDto attendanceDetailstoattendanceDetailsDto(AttendanceDetails attendanceDetails)
	{
		AttendanceDetailsDto attendanceDetailsDto= new AttendanceDetailsDto();

		
		
		
		attendanceDetailsDto.setFromDate(attendanceDetails.getFromDate());
		
		attendanceDetailsDto.setSelectEmployee(attendanceDetails.getSelectEmployee());
		


		return attendanceDetailsDto;
	}

}
