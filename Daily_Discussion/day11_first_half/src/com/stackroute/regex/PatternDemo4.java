package com.stackroute.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Ctrl+Shift+O ( for import )

class PatternDemo4 {
   /*
    *  + -----> 1 or more
    *  * ------> 0 or more
    *  ? ----- 0 or 1
    * - is for range
    * 
    */
	
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[a-zA-Z]+");
		Matcher matcher=pattern.matcher("dxc");
	    // boolean matches()      
		
		boolean b=matcher.matches();
	    System.out.println(b);
	}

}
