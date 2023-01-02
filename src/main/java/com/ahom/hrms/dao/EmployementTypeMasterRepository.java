package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ahom.hrms.entity.EmployementTypeMaster;

@EnableJpaRepositories
public interface EmployementTypeMasterRepository extends JpaRepository<EmployementTypeMaster, String>{

}
