package com.student.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;
import com.student.vo.StudentVo;

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
	
	public boolean addStudent(StudentVo studentVo)
	{
		boolean inserted=false;
		String SQL="INSERT INTO studentmaster VALUES(?,?,?)";
	    try {
			statement=connection.prepareStatement(SQL);
	        statement.setInt(1,studentVo.getRoll());
	        statement.setString(2,studentVo.getName());
	        statement.setInt(3,studentVo.getMarks());
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
	
	
	public   List<StudentVo> displayStudents()
	{
	List<StudentVo> studentList=new ArrayList<StudentVo>();// this will hold all the data read from the table
	 String SQL="SELECT roll,name,marks FROM studentmaster";
	 try {
		statement=connection.prepareStatement(SQL);
		result=statement.executeQuery();
		while(result.next())
		{
			StudentVo studentVo=new StudentVo();
			studentVo.setRoll(result.getInt("roll"));
			studentVo.setName(result.getString("name"));
			studentVo.setMarks(result.getInt("marks"));
		    studentList.add(studentVo);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		return studentList;
	}
	public boolean deleteStudent(int roll) {
		int records = 0;
		boolean deleteRecord = false;
		String sql = "DELETE from studentmaster where roll=?";
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, roll);
			records = statement.executeUpdate();
			if(records > 0) {
				deleteRecord = true;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return deleteRecord;
	}
	public boolean updateStudent(StudentVo student) {
		int records = 0;
		boolean updateRecord = false;
		String sql = "UPDATE studentmaster set name=?, marks=? where roll=?";
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setInt(2, student.getMarks());
			statement.setInt(3, student.getRoll());
			records = statement.executeUpdate();
			if(records > 0) {
				updateRecord = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return updateRecord;
	}
}
