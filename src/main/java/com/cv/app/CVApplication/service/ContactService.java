package com.cv.app.CVApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.CVApplication.model.Contact;
import com.cv.app.CVApplication.model.Personal;
import com.cv.app.CVApplication.repository.ContactRepo;

@Service
public class ContactService {
	
	@Autowired
	ContactRepo repo;
	
	public Contact getContactByUserId(int userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}
	
	public Contact createContact(Contact contact) {
		return repo.save(contact);
	}


}
