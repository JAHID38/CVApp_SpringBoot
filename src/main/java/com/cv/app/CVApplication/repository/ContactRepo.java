package com.cv.app.CVApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.CVApplication.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
