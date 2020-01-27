package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.BusinessType;

import java.util.List;

public interface BusinessTypeRepository extends CrudRepository<BusinessType, Long> {

}
