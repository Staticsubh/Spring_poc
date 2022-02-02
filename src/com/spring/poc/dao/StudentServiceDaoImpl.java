package com.spring.poc.dao;

import com.spring.poc.model.Student;

public class StudentServiceDaoImpl implements StudentServiceDao {

	@Override
	public Student addStudent() {
		
		Student student = new Student();
		student.setId(34);
		student.setName("Subhranil");
		student.setScore(56.3);
		
		return student;
		
	}

}
