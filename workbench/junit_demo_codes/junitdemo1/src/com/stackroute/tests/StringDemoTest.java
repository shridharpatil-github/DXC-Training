package com.stackroute.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.StringDemo;

public class StringDemoTest {

	
	public static StringDemo stringDemo;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		stringDemo=new StringDemo();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		stringDemo=null;
	}



	@Test
	public void testIfTheStringIsNull() {
		String name=stringDemo.getName();
		assertNull("Yes the string is null",name);
	}
	
	@Test
	public void testIfTheStringIsNotNull() {
	    stringDemo.setName("DXC");
	    
		assertNotNull("Yes the string is null",stringDemo.getName());
	}

}
