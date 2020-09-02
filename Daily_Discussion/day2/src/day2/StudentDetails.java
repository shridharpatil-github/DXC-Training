package day2;

import java.util.Scanner;

// Accepting Student details

public class StudentDetails {

	public static void main(String[] args) {
	
		 int rollNumber;
		 String studentName;
		 int studentMarks;
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the roll number");
		 rollNumber=scanner.nextInt();
		 System.out.println("Enter the name");
		 studentName=scanner.next();
		 System.out.println("Enter the student marks");
		 studentMarks=scanner.nextInt();
		 // float variable nextFloat()
		 System.out.println("The student details");
		 System.out.println("ROLL: "+rollNumber);
		 System.out.println("NAME: "+studentName);
		 System.out.println("MARKS: "+studentMarks);

	}

}
