package com.stackroute.tests;
// In the below line * means all the static members
// Advantage being while accessing the static members
// We don't need the mention of the class name of which 
// the static member belongs

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.Calculator;

public class CalcultorTest {

	public static Calculator calculator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Called once");
		calculator=new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("Called at the end once");
	calculator=null;
	}

	@Before
	public void setUp() throws Exception {
	System.out.println("Called before each testcase");
	}

	@After
	public void tearDown() throws Exception {
     System.out.println("Called after each test case");
	}

	@Test
	public void testAdd() {
		calculator.setNum1(10);
		calculator.setNum2(20);
		assertEquals("The value should be 30",30,calculator.add());
		
	}

	@Test
	public void testSubtract() {
		calculator.setNum1(20);
		calculator.setNum2(10);
		assertEquals("The value should be 10",10,calculator.subtract());
	}

	@Test
	public void testMultiply() {
		calculator.setNum1(20);
		calculator.setNum2(10);
		assertEquals("The value should be 200",200,calculator.multiply());
	}

}
