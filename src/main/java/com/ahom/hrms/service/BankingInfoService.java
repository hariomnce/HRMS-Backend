package com.ahom.hrms.service;

import com.ahom.hrms.dto.BankingInfoDto;
import com.ahom.hrms.entity.BankingInfo;

public interface BankingInfoService {
	
	void saveBankingInfo(BankingInfoDto bankingInfoDto);
	
	BankingInfo bankingInfoDtoToBankingInfo(BankingInfoDto bankingInfoDto);
	
	BankingInfoDto bankingInfoToBankingInfoDto(BankingInfo bankingInfo);

}
