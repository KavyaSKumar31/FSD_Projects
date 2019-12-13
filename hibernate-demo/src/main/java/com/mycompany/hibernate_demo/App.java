package com.mycompany.hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hibernate_demo.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   
    	   SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
    			   addAnnotatedClass(Student.class).buildSessionFactory();
    	   Session session=factory.getCurrentSession();
    	   Student student=new Student();
    	   student.setFirstName("John");
    	   student.setLastName("Doe");
    	   student.setEmail("john@luv2code.com");
    	   session.getTransaction().begin();
    	   session.save(student);
    	   session.getTransaction().commit();
    	   System.out.println("sucess");
    	   session.close();
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
		
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
}
