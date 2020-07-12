package com.cv.app.CVApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cv.app.CVApplication.model.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

	Contact findByUserId(Integer id);
	
	//List<Contact> findByUserId(Integer id);

}
