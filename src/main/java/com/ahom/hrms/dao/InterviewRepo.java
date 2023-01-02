package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahom.hrms.entity.Interview;

public interface InterviewRepo extends JpaRepository<Interview, Integer>{

}
