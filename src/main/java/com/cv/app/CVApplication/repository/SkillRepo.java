package com.cv.app.CVApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.CVApplication.model.Skill;

public interface SkillRepo extends JpaRepository<Skill, Integer>{

	Skill findByUserIdAndSkill(Integer id, String s);

	List<Skill> findByUserId(int userId);

}
