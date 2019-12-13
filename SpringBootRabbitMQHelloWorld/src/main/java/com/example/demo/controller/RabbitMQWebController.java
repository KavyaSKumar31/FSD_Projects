package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.RabbitMQSender;

@RestController
@RequestMapping(value = "/java-rabbitmq/")
public class RabbitMQWebController {

	@Autowired
	private RabbitMQSender rabbitMQSender;
	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("empName") String empName, @RequestParam("empId") String empId) {

		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		employeeService.save(emp);
		rabbitMQSender.send(emp);
		return "Message sent to the RabbitMQ  Successfully";
	}

}
