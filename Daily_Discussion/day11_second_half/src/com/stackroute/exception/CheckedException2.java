package com.stackroute.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;


// FileReader constructor is throwing a checked exception
// FileNotFoundException
// If we dont handle it gives compilation error
public class CheckedException2 {

	public static void main(String[] args) {
	
		try {
			FileReader reader=new FileReader("data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
