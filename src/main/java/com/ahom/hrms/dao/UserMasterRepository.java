package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ahom.hrms.entity.UserMaster;

@EnableJpaRepositories
public interface UserMasterRepository extends JpaRepository<UserMaster, Integer>{
	
	UserMaster findByUserName(String userName);

}
