package com.cv.app.CVApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.app.CVApplication.model.Personal;
@Repository
public interface PersonalRepo  extends JpaRepository<Personal, Integer>{
	
	public Personal findByUserId(int userId);

}
