package com.stackroute.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Ctrl+Shift+O ( for import )

class PatternDemo3 {
   /*
    *  + -----> 1 or more
    *  * ------> 0 or more
    * - is for range
    * \\d----> digits
    * 
    */
	
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("\\d+");
		Matcher matcher=pattern.matcher("1234");
	    // boolean matches()      
		
		boolean b=matcher.matches();
	    System.out.println(b);
	}

}
