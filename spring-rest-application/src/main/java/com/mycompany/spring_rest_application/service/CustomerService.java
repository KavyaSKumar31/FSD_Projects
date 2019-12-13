package com.mycompany.spring_rest_application.service;

import java.util.List;

import com.mycompany.spring_rest_application.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public Customer getCustomer(int theId);
	public Customer save(Customer customer);
	public void deleteCustomer(int theId);
	
}