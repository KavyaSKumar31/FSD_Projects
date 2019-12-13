package com.mycompany.spring_dependency_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_dependency_injection.beans.Coach;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {

			context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach myCoach = context.getBean("baseBallCoach", Coach.class);
			System.out.println("Coach Details: "+myCoach.toString());
			System.out.println("Workout plan of the day: " + myCoach.getDailyWorkout());
			System.out.println("Fortune of the day: " + myCoach.getDailyFortune());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.close();
		}
	}
}
