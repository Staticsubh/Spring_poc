package com.spring.poc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.spring.poc.model.Student;

public class StudentServiceDaoImpl implements StudentServiceDao {

	Connection conn = null;
	Statement stm = null;
	ResultSet rs = null;	
	
	private DataSource datasource;

	@Override
	public Student addStudent() {
		
		Student student = new Student();
		student.setId(34);
		student.setName("Subhranil");
		student.setScore(56.3);	
		
		try {
			conn = datasource.getConnection();
			stm = conn.createStatement();
			rs = stm.executeQuery("select * from USR");
			
			System.out.println("Printed : " + rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
		
	}

}
