package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service

public class EmployeeSearchService {

	private static List<Employee> employeeRepsitory = null;

	static {

		employeeRepsitory = new ArrayList<Employee>();
		employeeRepsitory.add(createEmployee(1L, "John", "Embedded C++", "Architect"));
		employeeRepsitory.add(createEmployee(2L, "Rahul", "Cloud", "Senior Developer"));

	}


	private static Employee createEmployee(Long id, String name, String practiceArea, String designation) {

		Employee emp = new Employee();

		emp.setEmployeeId(id);

		emp.setName(name);

		emp.setPracticeArea(practiceArea);

		emp.setDesignation(designation);

		emp.setCompanyInfo("IBM");

		return emp;

	}

	public Collection<Employee> findAll() {
		employeeRepsitory = new ArrayList<Employee>();
		employeeRepsitory.add(createEmployee(1L, "John", "Embedded C++", "Architect"));
		employeeRepsitory.add(createEmployee(2L, "Rahul", "Cloud", "Senior Developer"));
		return employeeRepsitory;

	}

}