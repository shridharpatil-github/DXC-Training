package com.typeconversioncasting.objects;

public class Main {

	public static void main(String[] args) {
		
		// Reference is of Person type and object is also of person type
		Person person=new Person();
		
		// Reference is of Student type and object is also of Student type
		
		
		Student student=new Student();
	
		// Reference is of collegeStudent type and object is also of CollegeStudent type
	   CollegeStudent collegeStudent=new CollegeStudent();
	   
	   // Reference is of base type and object is of derived type
	   Person person1=new Student();
	   
	   Person person2=new CollegeStudent();
	   
	   Object object1=new Person();
	   Object object2=new Student();
	   Object object3=new CollegeStudent();
	}

}
