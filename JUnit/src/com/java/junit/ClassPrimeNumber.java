package com.java.junit;


// Check the prime number
public class ClassPrimeNumber {
	public boolean primeNumberChecker(final Integer number) {
		for (int i = 2; i < (number / 2); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
