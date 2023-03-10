package com.ahom.hrms.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.dao.UserMasterRepository;
import com.ahom.hrms.dto.UserMasterDto;
import com.ahom.hrms.entity.UserMaster;
import com.ahom.hrms.service.UserMasterService;

@Service
public class UserMasterServiceImpl implements UserMasterService{
	
	@Autowired
	UserMasterRepository userMasterRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	//save data
	public void saveUser(UserMasterDto userMasterDto) {
		userMasterRepository.save(userMasterDtoToUserMaster(userMasterDto));
	}
	
	//fetch data by UserName
	public UserMasterDto fetchByUser(String userName) {
		UserMaster userMaster = this.userMasterRepository.findByUserName(userName);
		return userMasterToUserMasterDto(userMaster);
	}
	
	//update data
	public UserMasterDto updateUser(UserMasterDto userMasterDto) {
		userMasterRepository.save(userMasterDtoToUserMaster(userMasterDto));
		return userMasterDto;
	}
	
	//converting DTO
	public UserMaster userMasterDtoToUserMaster(UserMasterDto userMasterDto) {
		UserMaster userMaster = this.modelMapper.map(userMasterDto, UserMaster.class);
		return userMaster;
	}
	
	public UserMasterDto userMasterToUserMasterDto(UserMaster userMaster) {
		UserMasterDto userMasterDto = this.modelMapper.map(userMaster, UserMasterDto.class);
		return userMasterDto;
	}
}
