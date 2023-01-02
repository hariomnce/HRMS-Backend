package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ahom.hrms.entity.BasicEmployee;

@EnableJpaRepositories
public interface BasicEmployeeRepository extends JpaRepository<BasicEmployee, Integer>{
	
//	BasicEmployee findByEmployeeId(Integer employeeId);

}
