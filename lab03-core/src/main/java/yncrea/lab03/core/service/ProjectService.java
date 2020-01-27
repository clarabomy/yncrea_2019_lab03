package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.CustomerRepository;
import yncrea.lab03.core.dao.ProjectRepository;
import yncrea.lab03.core.entity.Project;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProjectService {
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void deleteAll() {
        projectRepository.deleteAll();
    }

    public void save(Project project){
        projectRepository.save(project);
    }

    public long countAll() {
        return projectRepository.count();
    }

    public List<Project> findAll(){
        return (List<Project>)projectRepository.findAll();
    }
}
