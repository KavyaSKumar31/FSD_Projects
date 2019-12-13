package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
