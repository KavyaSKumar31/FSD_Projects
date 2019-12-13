package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Course;

public interface CourseService {
public List<Course> getAllCourses();
public void createCourse(Course course);
public Optional<Course> getCourseById(int theId);

	
	
}
