package com.stackroute.regex;

public class PatternDemo8 {
// *---> 0 or more
// +---- 1 or more
// ? ---- 0 or 1
// //b ---> boundary	
	public static void main(String[] args) {
		
		
		
		//match exactly the word from
		// and from should not be part of
		// other words
		
		String regex=".*\\bfrom\\b.*";
        String sql="select from_source,to_destination employee_master";
        boolean b=sql.matches(regex);
        System.out.println(b);
	}

}










