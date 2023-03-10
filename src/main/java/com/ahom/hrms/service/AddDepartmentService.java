package com.ahom.hrms.service;

import com.ahom.hrms.dto.AddDepartmentDto;
import com.ahom.hrms.entity.AddDepartment;

public interface AddDepartmentService {
	
	void saveDepartment(AddDepartmentDto addDepartmentDto);
	
	AddDepartment addDepartmentDtoToAddDepartment(AddDepartmentDto addDepartmentDto);
	
	AddDepartmentDto addDepartmentToAddDepartmentDto(AddDepartment addDepartment);

}
