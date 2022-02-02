package com.spring.poc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.poc.dao.StudentServiceDao;
import com.spring.poc.model.Student;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentServiceDao studentServicedao; 

	@Override
	public Student addStudent() {
		return studentServicedao.addStudent();
	}

}
