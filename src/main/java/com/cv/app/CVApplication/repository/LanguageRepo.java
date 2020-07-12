package com.cv.app.CVApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.CVApplication.model.Language;

public interface LanguageRepo extends JpaRepository<Language, Integer>{

	Language findByUserIdAndLanguage(Integer id, String lang);

	List<Language> findByUserId(int userId);

}
