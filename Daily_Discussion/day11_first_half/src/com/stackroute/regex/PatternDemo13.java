package com.stackroute.regex;

public class PatternDemo13 {

	// Something in the begining of the string
	// ^
	// we are looking for the word/sentence should start with character
	public static void main(String[] args) {
		
		
		
		//match the from which is a begining of another word
		
		
		String regex="^[a-zA-Z].*";
        String sql="1elect source_from,to_destination  employee_master";
        boolean b=sql.matches(regex);
        System.out.println(b);
	}

}










