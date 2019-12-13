package com.mycompany.spring_hibernate_integration.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_hibernate_integration.service.CustomerService;

public class MyContextFactory {
	
	public static CustomerService getMyContextFactory()
	{
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service=context.getBean("customerService",CustomerService.class);
		return service;
	}

}
