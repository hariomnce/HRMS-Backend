package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ahom.hrms.entity.BankingInfo;

@EnableJpaRepositories
public interface BankingInfoRepository extends JpaRepository<BankingInfo, String>{

}
