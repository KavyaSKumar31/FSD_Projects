package com.example.demo.service;

import com.example.demo.dao.InstructorRepository;
import com.example.demo.entity.Instructor;

public class InstructorServiceImpl implements InstructorService {
	private InstructorRepository instructorRepository;

	public InstructorServiceImpl(InstructorRepository instructorRepository) {
		super();
		this.instructorRepository = instructorRepository;
	}

	@Override
	public void createInstructor(Instructor instructor) {
		instructorRepository.save(instructor);

	}

}
