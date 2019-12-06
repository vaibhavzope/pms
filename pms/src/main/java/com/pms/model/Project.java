package com.pms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer projectId;
	String projDescription;
	String projStartDate;
	String projEndDate;
	
	
	public Project(){
		
		
	}
	
	


	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjDescription() {
		return projDescription;
	}
	public void setProjDescription(String projDescription) {
		this.projDescription = projDescription;
	}
	public String getProjStartDate() {
		return projStartDate;
	}
	public void setProjStartDate(String projStartDate) {
		this.projStartDate = projStartDate;
	}
	public String getProjEndDate() {
		return projEndDate;
	}

	public void setProjEndDate(String projEndDate) {
		this.projEndDate = projEndDate;
	}

	
	
	
	
	
	
	
}
