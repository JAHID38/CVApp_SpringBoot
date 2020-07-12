package com.cv.app.CVApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.app.CVApplication.model.Education;

@Repository
public interface EducationRepo extends JpaRepository<Education, Integer> {

	Education findByUserIdAndDegree(Integer id, String degree);

	List<Education> findByUserIdOrderByPassingYearDesc(int userId);
 
}
