package com.ahom.hrms.service;

import com.ahom.hrms.dto.InterviewDto;
import com.ahom.hrms.entity.Interview;

public interface InterviewService {

	Interview interviewDtoInterview(InterviewDto interviewDto);

	InterviewDto interviewToInterviewDto(Interview interview);

	void saveInt(InterviewDto interviewDto);

}
