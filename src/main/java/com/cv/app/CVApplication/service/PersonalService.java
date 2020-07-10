package com.cv.app.CVApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.CVApplication.model.Account;
import com.cv.app.CVApplication.model.Personal;
import com.cv.app.CVApplication.repository.AccountRepo;
import com.cv.app.CVApplication.repository.PersonalRepo;

@Service
public class PersonalService {

	@Autowired
	private PersonalRepo repo;
	
	public Personal createPersonal(Personal personal) {
		return repo.save(personal);
	}

	public Personal getPersonalByUserId(int userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}
}
