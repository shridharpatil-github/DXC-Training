package com.stackroute.regex;

public class PatternStringMatchesMethod {

	public static void main(String[] args) {
		
		String regex="\\d+"; // we are looking for a pattern which 
		// 1 or more digits
       String mobileno="123456";
       // String method
       // boolean matches(String pattern)
       boolean b=mobileno.matches(regex);
       System.out.println(b);
	}

}
