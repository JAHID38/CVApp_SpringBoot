package com.cv.app.CVApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.CVApplication.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
