package day2;

import java.util.Scanner;

// Scanner is a class
// Scanner is used for accepting value from input devices
// input device can be a file or it can be a 
// the keyboard
// All the predefined classes in java is within one or
// the package
// packages helps in grouping the classes which performs
// similar kind or which are of similar types
// java.io ----> I/O ( File handling )
// java.sql ----> All the API or classes for database handling
// java.util ------> All the utility classes
public class UserInput {

	public static void main(String[] args) {
		
		int number=0;
		// System.in is representing the keyboard
		// Create a scanner object which will be initialised
		// with the information of the standard input device which is a keyboard
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the numnber");
		number=scanner.nextInt(); // nextInt method predefined method
		// The int data is being entered from the keyboard and stored
		// in the variable number
		System.out.println("The entered value is "+number);
		
		
	}

}
