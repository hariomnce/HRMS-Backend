package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ahom.hrms.entity.DesignationMaster;

@EnableJpaRepositories
public interface DesignationMasterRepository extends JpaRepository<DesignationMaster, Integer>{

}
