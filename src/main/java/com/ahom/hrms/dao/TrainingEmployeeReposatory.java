package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahom.hrms.entity.EmployeeTraining;


public interface TrainingEmployeeReposatory extends JpaRepository<EmployeeTraining, Integer> {

}
