package com.cv.app.CVApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.CVApplication.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

	Project findByUserIdAndProjectName(Integer id, String proj);

	List<Project> findByUserId(int userId);

}
