package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.Company;

import java.util.Map;

public interface CompanyRepository extends CrudRepository<Company, Long> {

}
