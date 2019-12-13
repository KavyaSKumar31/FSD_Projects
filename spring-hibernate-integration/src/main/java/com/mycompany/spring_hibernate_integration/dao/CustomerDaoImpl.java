package com.mycompany.spring_hibernate_integration.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.spring_hibernate_integration.entity.Customer;

import lombok.AllArgsConstructor;
@Repository("customerDao")
@AllArgsConstructor
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	
	public Customer createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.save(theCustomer);
		return theCustomer;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}

	@Override
	public Customer getCustomerByid(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Customer customer=session.get(Customer.class, id);
		return customer;
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer c where c.firstName=:firstName ",Customer.class);
		query.setParameter("firstName", firstName);
		return query.getResultList();
		
	}

	@Override
	@Transactional
	public Customer updateCuastomer(String firstName,String lastName,String email, int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Customer customer2=session.find(Customer.class, id);
		if(customer2!=null)
		{
			customer2.setFirstName(firstName);
			customer2.setLastName(lastName);
			customer2.setEmail(email);
			session.getTransaction().begin();
			session.saveOrUpdate(customer2);
			session.getTransaction().commit();
			
		}
		//customer2.setId(0);
		return customer2;
	}

}
