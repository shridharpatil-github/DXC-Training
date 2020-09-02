package com.stackroute.exception;

import java.io.FileReader;


// FileReader constructor is throwing a checked exception
// FileNotFoundException
// If we dont handle it gives compilation error
public class CheckedException {

	public static void main(String[] args) {
	
		FileReader reader=new FileReader("data.txt");
		
	}

}
