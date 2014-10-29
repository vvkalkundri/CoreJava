package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunitExceptions {

	String message = "Junit Test";
	ClassWithException cwe = new ClassWithException(message);

	// you were expecting the test case to raise a exception 
	@Test(expected = ArithmeticException.class)
	public void test() {
		assertEquals(message, cwe.printMessage());
	}

}
