package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
