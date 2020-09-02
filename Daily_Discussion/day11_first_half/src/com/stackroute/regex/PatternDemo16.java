package com.stackroute.regex;

public class PatternDemo16 {

	// ^ ----> for the begining
	// Something in the end of the string
	// $
	// we are looking for the word which is containing alphabets
	public static void main(String[] args) {
		
		
		
		//match the from which is a begining of another word
		
		
		String regex="^[a-zA-Z]+$";  
        String sql="DXC";
        boolean b=sql.matches(regex);
        System.out.println(b);
	}

}










