package com.stackroute.regex;

public class PatternDemo15 {

	// ^ ----> for the begining
	// Something in the end of the string
	// $
	// we are looking for the word which is containing alphabets
	public static void main(String[] args) {
		
		
		
		//match the from which is a begining of another word
		
		
		String regex="^[a-zA-Z]+$";  //digits,,(comma)
        String sql="1elect source_from,to_destination  employee_master1";
        boolean b=sql.matches(regex);
        System.out.println(b);
	}

}










