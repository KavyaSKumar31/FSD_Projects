package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseRepository;
import com.example.demo.entity.Course;
@Service
public class CourseServiceImpl implements CourseService {

	private CourseRepository courseRepository;
	@Override
	@Transactional
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	@Transactional
	public void createCourse(Course course) {
		courseRepository.save(course);
		
	}

	@Override
	public Optional<Course> getCourseById(int theId) {
		// TODO Auto-generated method stub
		
		Optional<Course> course=courseRepository.findById(theId);
		return course;
	}

}
