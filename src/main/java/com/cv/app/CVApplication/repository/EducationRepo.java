package com.cv.app.CVApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.CVApplication.model.Education;

public interface EducationRepo extends JpaRepository<Education, Integer> {
 
}
