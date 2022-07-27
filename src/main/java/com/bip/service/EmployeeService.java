package com.bip.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bip.Employee;
import com.bip.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Optional<Employee> findById(long l) {
		return employeeRepo.findById(1L);
	}

	public Employee save(Employee employee) {
		Employee save = employeeRepo.save(employee);
		//save.setName("Sushant");
		return save;
	}

}
