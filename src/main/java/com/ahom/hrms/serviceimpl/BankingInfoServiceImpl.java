package com.ahom.hrms.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahom.hrms.dao.BankingInfoRepository;
import com.ahom.hrms.dto.BankingInfoDto;
import com.ahom.hrms.entity.BankingInfo;
import com.ahom.hrms.service.BankingInfoService;

@Service
public class BankingInfoServiceImpl implements BankingInfoService{

	@Autowired
	BankingInfoRepository bankingInfoRepository;

	@Autowired
	ModelMapper modelMapper;

	//save data
	public void saveBankingInfo(BankingInfoDto bankingInfoDto) {
		bankingInfoRepository.save(bankingInfoDtoToBankingInfo(bankingInfoDto));
	}

	//converting DTO
	public BankingInfo bankingInfoDtoToBankingInfo(BankingInfoDto bankingInfoDto) {
		BankingInfo bankingInfo = this.modelMapper.map(bankingInfoDto, BankingInfo.class);
		return bankingInfo;
	}

	public BankingInfoDto bankingInfoToBankingInfoDto(BankingInfo bankingInfo) {
		BankingInfoDto bankingInfoDto = this.modelMapper.map(bankingInfo, BankingInfoDto.class);
		return bankingInfoDto;
	}

}
