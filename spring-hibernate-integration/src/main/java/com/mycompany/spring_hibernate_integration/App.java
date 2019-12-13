package com.mycompany.spring_hibernate_integration;

import java.util.Iterator;
import java.util.List;

import com.mycompany.spring_hibernate_integration.entity.Customer;
import com.mycompany.spring_hibernate_integration.factory.MyContextFactory;
import com.mycompany.spring_hibernate_integration.service.CustomerService;

public class App {

	public static void main(String[] args) {

		CustomerService service = MyContextFactory.getMyContextFactory();

		/*
		 * List<Customer> list = service.getAllCustomer(); Iterator<Customer> i =
		 * list.iterator(); while (i.hasNext()) { Customer c = i.next();
		 * System.out.println(c); }
		 */
		/*
		 * List<Customer> list=service.getCustomerByFirstName("XYZ"); if(list.isEmpty())
		 * { System.out.println("no record found!"); } else { for(Customer c:list) {
		 * System.out.println(c); } }
		 */
		
		Customer c=service.updateCuastomer("RRR","GGG","BBB", 100);
		if(c!=null)
		{
			System.out.println("upadted "+c);
		}
		else {
			System.out.println("no record found");	
		}
		
	}
}
