package com.cv.app.CVApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.CVApplication.model.Skill;
import com.cv.app.CVApplication.repository.SkillRepo;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepo repo;

	public Skill getSkillByUserIdAndSkill(Integer id, String s) {
		// TODO Auto-generated method stub
		return repo.findByUserIdAndSkill(id, s);
	}

	public Skill createSkill(Skill skill) {
		// TODO Auto-generated method stub
		return repo.save(skill);
	}

	public List<Skill> getSkillByUserId(int userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

}
