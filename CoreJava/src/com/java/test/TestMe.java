package com.java.test;

public class TestMe {
	public static void main(String[] args) {
		int num = 123;
		int rev = 0;
		int mul = 10;
		while (num != 0) {

			rev = (num % mul) + (rev * 10);
			num = num / 10;
		}
		System.out.println(rev);
	}
}
