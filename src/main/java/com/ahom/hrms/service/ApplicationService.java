package com.ahom.hrms.service;

import com.ahom.hrms.dto.ApplicationDto;
import com.ahom.hrms.entity.Application;

public interface ApplicationService {

	void svaeApp(ApplicationDto applicationDto);

	ApplicationDto appToAppDto(Application application);

	Application appDtoToapp(ApplicationDto applicationDto);
	

}
