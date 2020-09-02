package com.stackroute.regex;

public class PatternDemo12 {
// *---> 0 or more
// +---- 1 or more
// ? ---- 0 or 1
// //b ---> boundary	
	public static void main(String[] args) {
		
		
		
		//match the from which is a begining of another word
		
		
		String regex=".*from\\b.*";
        String sql="select source_from,to_destination  employee_master";
        boolean b=sql.matches(regex);
        System.out.println(b);
	}

}










