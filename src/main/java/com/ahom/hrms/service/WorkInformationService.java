package com.ahom.hrms.service;

import com.ahom.hrms.dto.WorkInformationDto;
import com.ahom.hrms.entity.WorkInformation;

public interface WorkInformationService {
	
	void saveWorkInfo(WorkInformationDto workInformationDto);
	
	WorkInformation workInformationDtoToWorkInformation(WorkInformationDto workInformationDto);
	
	WorkInformationDto workInformationToWorkInformationDto(WorkInformation workInformation);

}
