package com.ahom.hrms.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.dao.AddDepartmentRepository;
import com.ahom.hrms.dto.AddDepartmentDto;
import com.ahom.hrms.entity.AddDepartment;
import com.ahom.hrms.service.AddDepartmentService;

@Service
public class AddDepartmentServiceImpl implements AddDepartmentService{

	@Autowired
	AddDepartmentRepository addDepartmentRepository;

	@Autowired
	ModelMapper modelMapper;

	//save data
	public void saveDepartment(AddDepartmentDto addDepartmentDto) {
		addDepartmentRepository.save(addDepartmentDtoToAddDepartment(addDepartmentDto));
	}

	//converting DTO
	public AddDepartment addDepartmentDtoToAddDepartment(AddDepartmentDto addDepartmentDto) {
		AddDepartment addDepartment = this.modelMapper.map(addDepartmentDto, AddDepartment.class);
		return addDepartment;
	}

	public AddDepartmentDto addDepartmentToAddDepartmentDto(AddDepartment addDepartment) {
		AddDepartmentDto addDepartmentDto = this.modelMapper.map(addDepartment, AddDepartmentDto.class);
		return addDepartmentDto;
	}

}
