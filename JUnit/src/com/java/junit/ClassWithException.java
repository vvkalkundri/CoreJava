package com.java.junit;

public class ClassWithException {

	private String message;

	public ClassWithException(String message) {
		this.message = message;
	}

	public String printMessage() {
		System.out.println(message);
		int a = 1;
		int b = a / 0;
		return (message);
	}
}
