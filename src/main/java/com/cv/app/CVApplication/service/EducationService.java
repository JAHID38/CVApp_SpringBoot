package com.cv.app.CVApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.CVApplication.model.Education;
import com.cv.app.CVApplication.repository.EducationRepo;

@Service
public class EducationService {
	
	@Autowired
	private EducationRepo repo;

	public Education createEducation(Education education) {
		// TODO Auto-generated method stub
		return repo.save(education);		
	}

	public Education getEducationByUserIdAndDegree(Integer id, String degree) {
		// TODO Auto-generated method stub
		return repo.findByUserIdAndDegree(id, degree);
	}

	public List<Education> getEducationByUserId(int userId) {
		// TODO Auto-generated method stub
		return repo.findByUserIdOrderByPassingYearDesc(userId);
	}
	
	

}
