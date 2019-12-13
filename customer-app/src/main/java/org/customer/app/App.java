package org.customer.app;

import java.util.List;
import java.util.Scanner;

import org.customer.app.factory.CustomerFactory;
import org.customer.app.factory.CustomerFactoryImpl;
import org.customer.app.model.Customer;
public class App 
{
    private static Scanner scanner=new Scanner(System.in);
	public static void main( String[] args )
    {
        try {
        	CustomerFactory impl=new CustomerFactoryImpl();
			/*
			 * System.out.print("ID: "); int id=scanner.nextInt();
			 * System.out.print("NAME: "); String name=scanner.next();
			 * System.out.print("EMAIL: "); String email=scanner.next();
			 * 
			 * CustomerFactory impl=new CustomerFactoryImpl(); Customer
			 * customer=impl.createCustomer(id, name, email);
			 * System.out.println(customer.toString());
			 */
			/*
			 * List<Customer> list=impl.getAllCustomer(); for(Customer c:list) {
			 * System.out.println(c); }
			 */
        	System.out.print("enter id to search: ");
        	int id=scanner.nextInt();
        	impl.findById(id);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
