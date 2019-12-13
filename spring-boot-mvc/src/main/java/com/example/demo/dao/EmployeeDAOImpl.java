package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	public Employee save(Employee employee) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.save(employee);
		return employee;
	}

}
