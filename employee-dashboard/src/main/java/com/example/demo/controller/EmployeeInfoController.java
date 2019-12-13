package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeInfoController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/dashboard/peers")
	public Collection<Employee> findPeers() {

		String url = "http://nilay-hp-elitebook-840-g2.d4t-in.ibmmobiledemo.com:8050/employee-search-service/api/employees";
		System.out.println("URL" + url);

		@SuppressWarnings("unchecked")
		List<Employee> list = restTemplate.getForObject(url, List.class);

		System.out.println("RESPONSE " + list);

		return list;

	}

}