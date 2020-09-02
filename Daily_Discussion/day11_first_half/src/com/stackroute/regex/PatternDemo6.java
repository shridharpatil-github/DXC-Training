package com.stackroute.regex;

public class PatternDemo6 {
// *---> 0 or more
// +---- 1 or more
// ? ---- 0 or 1
	
	public static void main(String[] args) {
		
		// . matches any character at a time
		// * means 0 or more
		// match any character before and after from
		String regex=".*from.*";
        String sql="select * from employee_master";
        boolean b=sql.matches(regex);
        System.out.println(b);
	}

}










