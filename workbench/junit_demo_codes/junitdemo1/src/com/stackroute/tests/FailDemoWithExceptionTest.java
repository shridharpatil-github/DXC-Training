package com.stackroute.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.stackroute.FailDemo;

public class FailDemoWithExceptionTest {

	private static FailDemo failDemo;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	 failDemo=new FailDemo();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		
		failDemo.setNum1(10);
		failDemo.setNum2(0);
		failDemo.divide();
	}

	@Ignore
	@Test(expected=ArithmeticException.class)
	public void testDivide2() {
		
		failDemo.setNum1(10);
		failDemo.setNum2(2);
		failDemo.divide();
	}
}
