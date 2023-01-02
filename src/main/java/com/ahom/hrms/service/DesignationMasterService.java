package com.ahom.hrms.service;

import java.util.List;

import com.ahom.hrms.dto.DesignationMasterDto;
import com.ahom.hrms.entity.DesignationMaster;

public interface DesignationMasterService {
	
	void saveDesignation(DesignationMasterDto designationMasterDto);
	
	List<DesignationMasterDto> getAllEmployee();
	
	DesignationMaster designationMasterDtoToDesignationMaster(DesignationMasterDto designationMasterDto);
	
	DesignationMasterDto designationMasterToDesignationMasterDto(DesignationMaster designationMaster);

}
