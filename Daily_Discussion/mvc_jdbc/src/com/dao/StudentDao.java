package com.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;


public class StudentDao {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet result;
	
	public StudentDao()
	{
	 try {
			Driver driver=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	      System.out.println("Getting connected!!!");	
	 } catch (SQLException e) {
		 e.printStackTrace();
		} 	
	}
	
	public boolean addStudent(Student student)
	{
		boolean inserted=false;
		String SQL="INSERT INTO studentmaster VALUES(?,?,?)";
	    try {
			statement=connection.prepareStatement(SQL);
	        statement.setInt(1,student.getRoll());
	        statement.setString(2,student.getName());
	        statement.setInt(3,student.getMarks());
	        int recordUpdated=statement.executeUpdate();
	        if(recordUpdated>0)
	        {
	           inserted=true;    	
	        }
	    } catch (SQLException e) {
			
			e.printStackTrace();
		}
	    return inserted;
	}

	public List<Student> getStudents() {
		String SQL="SELECT roll,name,marks FROM studentmaster";
		List<Student> studentList=new ArrayList<>();
		try {
			statement=connection.prepareStatement(SQL);
			result=statement.executeQuery();
			while(result.next())
			{
				Student student=new Student();
				student.setRoll(result.getInt("roll"));
				student.setName(result.getString("name"));
			    student.setMarks(result.getInt("marks"));
			    studentList.add(student);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studentList;
	}
	
	
	
	
}
