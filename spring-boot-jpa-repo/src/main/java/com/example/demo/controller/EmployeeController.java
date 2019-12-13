package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/employees")
	public List<Employee> list()

	{
		return employeeService.getALlEmployee();
	}
	@GetMapping("/employees/{firstName}")
	public List<Employee> getByFirstName(@PathVariable String firstName)
	{
		return employeeService.findByFirstName(firstName);
	}
}
