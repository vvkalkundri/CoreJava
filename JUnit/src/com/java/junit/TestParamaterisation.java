package com.java.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestParamaterisation {
	private int inputNumber;
	private boolean expectedResult;
	ClassPrimeNumber cpn;

	// Constructor that takes arguments as the constructor before running the
	public TestParamaterisation(Integer input, Boolean result) {
		this.inputNumber = input;
		this.expectedResult = result;
	}

	@Parameterized.Parameters
	public static Collection primeNumber() {
		return Arrays.asList(new Object[][] { { 2, true }, { 6, false } });

	}

	@Before
	public void intialize() {
		cpn = new ClassPrimeNumber();
	}

	@Test
	public void testPrimeNumber() {
		System.out.println(" Input number is : " + inputNumber);
		assertEquals(expectedResult, cpn.primeNumberChecker(inputNumber));
	}

}
