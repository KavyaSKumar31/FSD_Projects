package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	private List<Customer> customers=null;
	Logger log=LoggerFactory.getLogger(CustomerController.class);
	@PostConstruct
	public void init()
	{
		log.info("post construct worked..");
		customers=new ArrayList<Customer>();
		customers.add(new Customer("John", "Doe", "john@spring.io"));
		customers.add(new Customer("Shane", "Warne", "shane@luv2code.com"));
	}
	

	@GetMapping("/customers")
	public List<Customer> getAllCustomer()
	{
		return customers;
	}
	
	@PreDestroy
	public void destroy()
	{
		log.info("pre destroy worked..");
		customers=null;
	}
	
}
