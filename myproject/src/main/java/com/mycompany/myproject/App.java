package com.mycompany.myproject;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mycompany.myproject.factory.CustomerFactory;
import com.mycompany.myproject.factory.CustomerFactoryImpl;
import com.mycompany.myproject.model.Customer;

public class App {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			CustomerFactory impl = new CustomerFactoryImpl();
			Customer customer = null;
			int choice=0;

			do {
				System.out.println("1. create customer.");

				System.out.println("2. display all customer.");
				System.out.println("3.find customer by id. ");
				System.out.println("4. update customer.");
				System.out.println("5.remove customer.");
				System.out.println("0.exit");
				System.out.print("enter your choice: ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:

					System.out.print("ID: ");
					int id = scanner.nextInt();
					System.out.print("NAME: ");
					String name = scanner.next();
					System.out.print("EMAIL: ");
					String email = scanner.next();

					customer = impl.createCustomer(id, name, email);
					System.out.println(customer.toString());
					break;
				case 2:

					List<Customer> list = impl.getAllCustomer();
					Iterator<Customer> i=list.iterator();
					while(i.hasNext())
					{
						System.out.println(i.next());
					}
					break;
				case 3:
					System.out.print("enter id to search: ");
					id = scanner.nextInt();
					impl.findById(id);
					break;
				case 4:
					System.out.print("enter id to update: ");
					id = scanner.nextInt();
					impl.updateCustomer(id);
					break;
					
				case 0:
					System.out.println("bye!");
					System.exit(0);
				default:
					System.out.println("invalid choice..");
					break;
				}

			} while (choice != 0);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
