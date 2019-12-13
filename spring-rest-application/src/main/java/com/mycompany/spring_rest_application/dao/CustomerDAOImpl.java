package com.mycompany.spring_rest_application.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.spring_rest_application.controller.CustomerNotFoundException;
import com.mycompany.spring_rest_application.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Customer> getCustomers() {
		
	
		Session currentSession = sessionFactory.getCurrentSession();
				
		
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer order by lastName",
											Customer.class);
		
	
		List<Customer> customers = theQuery.getResultList();
				
			
		return customers;
	}

	@Override
	public Customer getCustomer(int theId) {
		Session currentSession = sessionFactory.openSession();
		Customer customer=currentSession.get(Customer.class, theId);
		if(customer==null)
		{
			throw new CustomerNotFoundException("Cuistomer with nthe given id is not found: "+theId);
		}
		
		return customer;
	}

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.openSession();
		currentSession.getTransaction().begin();
		currentSession.saveOrUpdate(customer);
		currentSession.getTransaction().commit();
		return customer;
	}



	@Override
	public void deleteCustomer(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Customer customer=currentSession.get(Customer.class, theId);
		if(customer==null)
		{
			throw new CustomerNotFoundException("customer not found with the given id: "+theId);
		}
		currentSession.remove(customer);
		
	}

	
}










