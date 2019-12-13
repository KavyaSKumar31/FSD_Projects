package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CourseRepository;
import com.example.demo.dao.InstructorRepository;
import com.example.demo.entity.Course;
import com.example.demo.entity.Instructor;

@SpringBootApplication
public class SpringBootJpaRepoApplication {
	
	private CourseRepository courseRepository;
	private InstructorRepository instructorRepository;

	
	public SpringBootJpaRepoApplication(CourseRepository courseRepository, InstructorRepository instructorRepository) {
		super();
		this.courseRepository = courseRepository;
		this.instructorRepository = instructorRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaRepoApplication.class, args);
	}
	
	@Component
	class CourseCommand implements CommandLineRunner
	{

		@Override
		public void run(String... args) throws Exception {
			List<Course> list=new ArrayList<Course>();
			Instructor tempInstructor=new Instructor();
			Course tempCourse=new Course();
			tempInstructor.setFirstName("John");
			tempInstructor.setLastName("Doe");
			tempInstructor.setEmail("john@luv2code.com");
			tempCourse.setTitle("Learning Spring.");
			list.add(tempCourse);
			tempCourse.setInstructor(tempInstructor);
			tempInstructor.setCourses(list);
			instructorRepository.save(tempInstructor);
			courseRepository.save(tempCourse);
			
		}
		
	}

}
