package com.student.main;

import java.util.List;
import java.util.Scanner;

import com.student.dao.StudentDao;
import com.student.vo.StudentVo;

public class StudentMain {

	public static void main(String[] args) {
		StudentDao studentDao=new StudentDao(); // Database handling
		StudentVo studentVo=new StudentVo();     // Storing student details

		// Following line are for user input
		Scanner scanner=new Scanner(System.in);

		while(true) {
			System.out.println("*******Student DataBase*********");
			System.out.println("Select Option");
			System.out.println("1: ADD Student");
			System.out.println("2: View All Student's");
			System.out.println("3: Update Student Detail's");
			System.out.println("4: Delete Student Record");
			System.out.println("5: Exit");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter the roll");
				int roll=scanner.nextInt();
				System.out.println("Enter the name");
				String name=scanner.next();
				System.out.println("Enter the marks");
				int marks=scanner.nextInt();

				// following lines are for storing the data in studentCVo
				studentVo.setRoll(roll);
				studentVo.setName(name);
				studentVo.setMarks(marks);

				// StudentVo object is passed to StudentDao so that data in the StudentVo object can be saved in the database table
				boolean isRecordAdded=studentDao.addStudent(studentVo);
				if(isRecordAdded)
				{
					System.out.println("Record added!!!");
				}
				else
				{
					System.out.println("Not able to add record!!!!");
				}
				break;
			case 2:
				System.out.println("The data is ");
				List<StudentVo> studentList=studentDao.displayStudents();
				for(StudentVo student : studentList)
				{
					System.out.println(student.getRoll()+"\t"+student.getName()+"\t"+student.getMarks());
				}
				break;
			case 3:

				System.out.println("----Student Update--");
				StudentVo student = new StudentVo();
				System.out.println("Enter roll number for Update Student Record");
				student.setRoll(scanner.nextInt());
				System.out.println("Enter name to update");
				student.setName(scanner.next());
				System.out.println("Enter marks to update");
				student.setMarks(scanner.nextInt());
				boolean updated = studentDao.updateStudent(student);
				if(updated) {
					System.out.println("Student Details Updated !!");
				}else {
					System.out.println(" student Not Found");
				}

				break;
			case 4:

				System.out.println("----Student Delete--");
				System.out.println("Enter roll number for Delete Student Record");
				int rollNum = scanner.nextInt();
				boolean delete = studentDao.deleteStudent(rollNum);
				if(delete) {
					System.out.println("Student Details Deleted !!");
				}else {
					System.out.println(rollNum+" student Not Found");
				}


				break;
			case 5: 
				System.exit(0);
				break;
			default:
				System.out.println("Please select Valid option!!");
				break;
			}
		}


	}

}
