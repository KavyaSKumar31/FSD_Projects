package com.mycompany.myproject.factory;

import java.util.List;

import com.mycompany.myproject.model.Customer;

public interface CustomerFactory {
	
	public Customer createCustomer(int id,String name,String email);
	public List<Customer> getAllCustomer();
	public void findById(int id);
	public void deleteCustomer(int id);
	public void updateCustomer(int id);
	

}
