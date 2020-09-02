package com.stackroute.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FailDemoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		try
		{
		int num1=10;
		int num2=0;
		int result=num1/num2;
		fail("This line will fail");
		}catch(Exception exception)
		{
			System.out.println(exception);
		}
	}
	
	@Test
	public void test2() {
		try
		{
		int num1=10;
		int num2=2;
		int result=num1/num2;
		fail("This line will fail");
		}catch(Exception exception)
		{
			System.out.println(exception);
		}
	}
	
	@Test
	public void test3() {
		try
		{
		int num1=10;
		int num2=5;
		int result=num1/num2;
		
		}catch(Exception exception)
		{
			fail("This line will fail");
		}
	}
	
	@Test
	public void test4() {
		try
		{
		int num1=10;
		int num2=0;
		int result=num1/num2;
		
		}catch(Exception exception)
		{
			fail("This line will fail");
		}
	}
}
