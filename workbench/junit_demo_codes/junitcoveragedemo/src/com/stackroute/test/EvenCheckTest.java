package com.stackroute.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.stackroute.EvenCheck;

class EvenCheckTest {
private static EvenCheck evenCheck;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	evenCheck=new EvenCheck();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testIsEven() {
	 evenCheck.setNum(10);
	 assertTrue(evenCheck.isEven());
	}

	@Test
	void testIsNotEven() {
	 evenCheck.setNum(5);
	 assertFalse(evenCheck.isEven());
	}

	@Test
	void testGetNum()
	{
		evenCheck.setNum(5);
		assertEquals("The value should be 5",5,evenCheck.getNum());
	}
	
}
