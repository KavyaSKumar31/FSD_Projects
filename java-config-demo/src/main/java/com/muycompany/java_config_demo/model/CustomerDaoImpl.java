package com.muycompany.java_config_demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component

public class CustomerDaoImpl implements CustomerDao {
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDaoImpl() {
		super();
	}

	@Autowired
	
	public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void createCustomer() {
		// TODO Auto-generated method stub

	}

}
