package com.mycompany.spring_hibernate_integration.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.spring_hibernate_integration.dao.CustomerDao;
import com.mycompany.spring_hibernate_integration.entity.Customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	@Transactional
	public Customer createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		return customerDao.createCustomer(theCustomer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
	
		
		return customerDao.getAllCustomer();
	}

	@Override
	@Transactional
	public Customer getCustomerByid(int id) {
		// TODO Auto-generated method stub
		Customer customer=customerDao.getCustomerByid(id);
		if(customer!=null)
		{
			return customer;
		}
		else
		{
			return null;
		}
	
	}

	@Override
	@Transactional
	public List<Customer> getCustomerByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByFirstName(firstName);
	}

	@Override
	public Customer updateCuastomer(String firstName, String lastName, String email, int id) {
		// TODO Auto-generated method stub
		 
		Customer c=		customerDao.updateCuastomer(firstName, lastName, email, id);
		if(c!=null)
		{
			return c;
		}
		else
		{
			return null;
		}
	}

	
}
