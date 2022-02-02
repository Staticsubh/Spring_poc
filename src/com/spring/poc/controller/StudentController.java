package com.spring.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.poc.model.Student;
import com.spring.poc.service.StudentService;

@RestController
@RequestMapping(value = "/student/")
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "add/", method = RequestMethod.GET)
	public Student addStudent() {
		
		System.out.println("Added");
		
		return studentService.addStudent();
	}
}
