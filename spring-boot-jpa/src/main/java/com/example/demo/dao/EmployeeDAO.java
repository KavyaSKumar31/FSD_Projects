package com.example.demo.dao;
import java.util.List;

import com.example.demo.entity.Employee;



public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	public List<Employee> findByEmail(String email);
	
}