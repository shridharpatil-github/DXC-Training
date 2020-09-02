package com.stackroute.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Ctrl+Shift+O ( for import )

class PatternDemo2 {
   /*
    *  + -----> 1 or more
    *  * ------> 0 or more
    * - is for range
    * 
    */
	
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[0-9]+");
		Matcher matcher=pattern.matcher("");
	    // boolean matches()      
		
		boolean b=matcher.matches();
	    System.out.println(b);
	}

}
