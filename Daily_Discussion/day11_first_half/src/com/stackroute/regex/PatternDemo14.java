package com.stackroute.regex;

public class PatternDemo14 {

	// Something in the end of the string
	// $
	// we are looking for the word/sentence should end up  with a digit
	public static void main(String[] args) {
		
		
		
		//match the from which is a begining of another word
		
		
		String regex=".*[0-9]$";
        String sql="1elect source_from,to_destination  employee_master1";
        boolean b=sql.matches(regex);
        System.out.println(b);
	}

}










