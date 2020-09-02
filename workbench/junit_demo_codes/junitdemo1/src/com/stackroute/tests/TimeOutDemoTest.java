package com.stackroute.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.TimeOutDemo;

public class TimeOutDemoTest {

	private static TimeOutDemo timeOutDemo;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	   timeOutDemo=new TimeOutDemo();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(timeout=100)
	public void test() {
		timeOutDemo.disp();
	}

	@Test(timeout=100)
	public void test2() {
		timeOutDemo.disp2();
	}
}
