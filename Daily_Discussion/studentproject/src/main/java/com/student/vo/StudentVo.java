package com.student.vo;

// StudentVO class object storing student details
public class StudentVo {
 private int roll;
 private String name;
 private int marks;
 
public StudentVo() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentVo(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + marks;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + roll;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	StudentVo other = (StudentVo) obj;
	if (marks != other.marks)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (roll != other.roll)
		return false;
	return true;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "StudentVo [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}
 
 
}
