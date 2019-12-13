package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getALlEmployee();
	public Optional<Employee> getEmployeeByID(int theID);
	
	public List<Employee> findByFirstName(String firstName);

}
