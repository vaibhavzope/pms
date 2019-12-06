package com.pms.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.pms.model.Project;
import com.pms.repo.ProjectRepository;



@RestController
public class ProjectController {

	@Autowired
	ProjectRepository projectRepository;
	
	
	@GetMapping("/api/pms/projectById/{id}")
	Optional<Project> getOneProjects(@PathVariable Integer id) {
		
		return projectRepository.findById(id);
	}
	
	@GetMapping("/api/pms/projectAll")
	List<Project> getAllProjects(){
		System.out.println(projectRepository.findAll());
		return projectRepository.findAll();
		
	}
	
	@PostMapping("/api/pms/addProject")
	void addProject(@RequestBody Project project) {
		System.out.println(project.toString());
		projectRepository.save(project);
	
	}
	
	@DeleteMapping("/api/pms/deleteProject/{id}")
	void deleteProject(@PathVariable Integer id) {
		projectRepository.deleteById(id);
	}
	
	
	@PutMapping("/api/pms/updateProject/{id}")
	Project updateProject(@RequestBody Project project, @PathVariable Integer id){
		
		Project p= projectRepository.getOne(id);
		
		p.setProjDescription(project.getProjDescription());
		p.setProjStartDate(project.getProjStartDate());
		p.setProjEndDate(project.getProjEndDate());
		
		return projectRepository.save(p);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
