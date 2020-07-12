package com.cv.app.CVApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.CVApplication.model.Language;
import com.cv.app.CVApplication.repository.LanguageRepo;

@Service
public class LanguageService {
	
	@Autowired
	LanguageRepo repo;

	public Language getLanguageByUserIdAndLanguage(Integer id, String lang) {
		// TODO Auto-generated method stub
		return repo.findByUserIdAndLanguage(id, lang);
	}

	public Language createLanguage(Language language) {
		// TODO Auto-generated method stub
		return repo.save(language);
	}

	public List<Language> getLanguageByUserId(int userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

}
