package com.stackroute.keepnote.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int empId;
	private String name;
	private String designation;
	private String department;
	private int basic;
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBasic() {
		return basic;
	}


	public void setBasic(int basic) {
		this.basic = basic;
	}


	private LocalDateTime joiningDate;
	

	public Employee() {
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(LocalDateTime joiningDate) {
		this.joiningDate = joiningDate;
	}

	
}