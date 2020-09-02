package com.stackroute.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.EvenCheck;

public class EvenCheckTest {

	
	private static EvenCheck evenCheck;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		evenCheck=new EvenCheck();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	evenCheck=null;
	}

	@Test
	public void testIsEven() {
		evenCheck.setNumber(10);
		assertTrue(evenCheck.isEven());
	}
	
	@Test
	public void testIsEvenFailure() {
		evenCheck.setNumber(5);
		assertFalse(evenCheck.isEven());
	}

}
