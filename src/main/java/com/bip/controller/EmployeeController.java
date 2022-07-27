package com.bip.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bip.Employee;
import com.bip.service.EmployeeService;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping
	public Employee findById() {
		Optional<Employee> findById = service.findById(1L);
		if(!findById.isEmpty()) {
			Employee employee = findById.get();
			System.out.println(employee);
		}
		return findById.get();
	}
	
	@PostMapping
	public Employee save() {
		Employee employee = new Employee();
		return service.save(employee);
	}
}
