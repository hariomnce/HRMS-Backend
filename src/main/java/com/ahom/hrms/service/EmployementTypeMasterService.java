package com.ahom.hrms.service;

import com.ahom.hrms.dto.EmployementTypeMasterDto;
import com.ahom.hrms.entity.EmployementTypeMaster;

public interface EmployementTypeMasterService {
	
	void saveEmployement(EmployementTypeMasterDto employementTypeMasterDto);
	
	EmployementTypeMaster employementTypeMasterDtoToEmployementTypeMaster(EmployementTypeMasterDto employementTypeMasterDto);
	
	EmployementTypeMasterDto employementTypeMasterToUserEmployementTypeMasterDto(EmployementTypeMaster employementTypeMaster);

}
