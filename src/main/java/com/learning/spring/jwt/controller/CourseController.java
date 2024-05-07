package com.learning.spring.jwt.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.spring.jwt.model.Course;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course("Learn AWS", "Author1"),
				new Course("Learn DevOps", "Author2")
				);
	}

}
