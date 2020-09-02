package day3;
// Scanner is a predefined class
// To use scanner for user input
// we have to create an object of Scanner class
// Scanner class is having method
// nextInt
// next ( String without space) suppose hello
// nextLine ( String with spaces) suppose hello world
import java.util.Scanner;
public class Revise3 {

	public static void main(String[] args) {
		// We are creating an object of scanner class
		// and initialising with the standard input
		// device, the standard input device is the
		// keyboard which is represented as in
		Scanner scan=new Scanner(System.in);
		int num;
		float f;
		String firstName;
		System.out.println("Enter a number");
		num=scan.nextInt();
		System.out.println("Enter a float value");
		f=scan.nextFloat();
		System.out.println("Enter a string");
		firstName=scan.next();
   		System.out.println(num);
	    System.out.println(f);
	    System.out.println(firstName);
	}

}
