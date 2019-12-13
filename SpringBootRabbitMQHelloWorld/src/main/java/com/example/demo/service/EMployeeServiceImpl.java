package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepository;
import com.example.demo.model.Employee;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EMployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Override
	@Transactional
	public void save(Employee employee) {
		employeeRepository.save(employee);

	}

}
