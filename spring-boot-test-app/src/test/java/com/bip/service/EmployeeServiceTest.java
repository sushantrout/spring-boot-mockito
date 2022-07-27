package com.bip.service;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bip.Employee;
import com.bip.repo.EmployeeRepo;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
	@Mock
	private EmployeeRepo employeeRepo;
	
	@InjectMocks EmployeeService employeeService;
	
	@Test
	public void findByIdTest() {
		Employee value = new Employee();
		value.setId(1L);
		value.setName("SKR");
		
		Mockito.when(employeeRepo.findById(1l)).thenReturn(Optional.of(value));
		Optional<Employee> findById = employeeService.findById(1L);
		Assertions.assertEquals(value.getId(), findById.get().getId());
	}
	
	@Test
	public void saveTest() {
		Employee value = new Employee();
		value.setId(1L);
		value.setName("SKR");
		
		Employee value1 = new Employee();
		value1.setId(1L);
		value1.setName("SKR1");
		
		Mockito.when(employeeRepo.save(value)).thenReturn(value1);
		Employee findById = employeeService.save(value);
		System.out.println(findById.getName());
		Assertions.assertEquals(value.getId(), findById.getId());
	}
}
