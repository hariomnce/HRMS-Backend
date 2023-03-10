package com.ahom.hrms.service;

import com.ahom.hrms.dto.UserMasterDto;
import com.ahom.hrms.entity.UserMaster;

public interface UserMasterService {
	
	void saveUser(UserMasterDto userMasterDto);
	
	UserMasterDto fetchByUser(String userName);
	
	UserMasterDto updateUser(UserMasterDto userMasterDto);
	
	UserMaster userMasterDtoToUserMaster(UserMasterDto userMasterDto);
	
	UserMasterDto userMasterToUserMasterDto(UserMaster userMaster);

}
