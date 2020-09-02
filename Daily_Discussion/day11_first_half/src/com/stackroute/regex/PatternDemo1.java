package com.stackroute.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Ctrl+Shift+O ( for import )

class PatternDemo1 {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("dxc");
		Matcher matcher=pattern.matcher("abcd");
	    // boolean matches()      
		
		boolean b=matcher.matches();
	    System.out.println(b);
	}

}
