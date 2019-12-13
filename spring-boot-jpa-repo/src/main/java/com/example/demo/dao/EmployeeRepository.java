package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public List<Employee> findByEmail(String email);
	public List<Employee> findByFirstName(String firstName);
	
}
