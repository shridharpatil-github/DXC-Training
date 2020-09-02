package com.stackroute.regex;

public class PatternDemo5 {

	public static void main(String[] args) {
		// return false because from 
		// pattern is a part of a string
		
		
		String regex="from";
        String sql="select * from student_master";
        boolean b=sql.matches(regex);
        System.out.println(b);
	}

}
