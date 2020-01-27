package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.BusinessType;
import yncrea.lab03.core.entity.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
