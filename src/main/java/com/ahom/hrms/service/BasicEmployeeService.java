package com.ahom.hrms.service;

import com.ahom.hrms.dto.BasicEmployeeDto;
import com.ahom.hrms.entity.BasicEmployee;

public interface BasicEmployeeService {
	
	void saveEmployee(BasicEmployeeDto basicEmployeeDto);
	
	BasicEmployeeDto employeeById(int employeeId);
	
	BasicEmployee basicEmployeeDtoToBasicEmployee(BasicEmployeeDto basicEmployeeDto);
	
	BasicEmployeeDto basicEmployeeToBasicEmployeeDto(BasicEmployee basicEmployee);

}
