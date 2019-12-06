package com.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.model.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
