package comm.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		try {
			
			ClassPathXmlApplicationContext context=
					new ClassPathXmlApplicationContext("applicationContext.xml");
			/*
			 * Coach tempCoach=context.getBean("theCoach",BaseballCoach.class);
			 * System.out.println(tempCoach.getDailyWorkout());
			 */

			Customer theCustomer=context.getBean("customer",Customer.class);
			System.out.println(theCustomer);
			Customer theCustomer1=context.getBean("customer",Customer.class);
			System.out.println(theCustomer==theCustomer1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
