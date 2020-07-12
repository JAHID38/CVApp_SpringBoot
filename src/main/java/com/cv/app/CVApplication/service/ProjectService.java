package com.cv.app.CVApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.CVApplication.model.Project;
import com.cv.app.CVApplication.repository.ProjectRepo;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepo repo;

	public Project getProjectByUserIdAndProjectName(Integer id, String proj) {
		// TODO Auto-generated method stub
		return repo.findByUserIdAndProjectName(id, proj);
	}

	public Project createProject(Project project) {
		// TODO Auto-generated method stub
		return repo.save(project);
	}

	public List<Project> getProjectByUserId(int userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

}
