package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahom.hrms.entity.Deduction;

public interface DeductionRepository extends JpaRepository<Deduction, Integer> {

}
