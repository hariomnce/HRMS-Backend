package com.ahom.hrms.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.dao.WorkInformationRepository;
import com.ahom.hrms.dto.WorkInformationDto;
import com.ahom.hrms.entity.WorkInformation;
import com.ahom.hrms.service.WorkInformationService;

@Service
public class WorkInformationServiceImpl implements WorkInformationService{
	
	@Autowired
	WorkInformationRepository workInformationRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	//save data
	public void saveWorkInfo(WorkInformationDto workInformationDto) {
		workInformationRepository.save(workInformationDtoToWorkInformation(workInformationDto));
	}
	
	//converting DTO
	public WorkInformation workInformationDtoToWorkInformation(WorkInformationDto workInformationDto) {
		WorkInformation workInformation = this.modelMapper.map(workInformationDto, WorkInformation.class);
		return workInformation;
	}
	
	public WorkInformationDto workInformationToWorkInformationDto(WorkInformation workInformation) {
		WorkInformationDto workInformationDto = this.modelMapper.map(workInformation, WorkInformationDto.class);
		return workInformationDto;
	}

}
