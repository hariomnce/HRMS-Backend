package com.ahom.hrms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahom.hrms.entity.TrainingFeedback;

public interface TrainingFeedbackReposatory extends JpaRepository<TrainingFeedback, String> {

}
