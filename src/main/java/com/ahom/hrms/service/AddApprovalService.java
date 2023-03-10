package com.ahom.hrms.service;

import com.ahom.hrms.dto.AddApprovalDto;
import com.ahom.hrms.entity.AddApproval;

public interface AddApprovalService {
	
	void saveAddApproval(AddApprovalDto addApprovalDto);
	
	AddApproval addApprovalDtoToAddApproval(AddApprovalDto addApprovalDto);
	
	AddApprovalDto addApprovalToAddApprovalDto(AddApproval addApproval);

}
