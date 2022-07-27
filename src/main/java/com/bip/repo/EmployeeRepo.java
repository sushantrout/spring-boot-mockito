package com.bip.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bip.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
