package com.stackroute.regex;

import java.util.Scanner;

public class DataEntry {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a sentence");
		//String sentence=scanner.next(); // next will think as terminator it wont go for accepting other words
         String sentence=scanner.nextLine();
		System.out.println(sentence);
	
	}

}
