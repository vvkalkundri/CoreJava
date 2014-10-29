package com.pranav.volatiletest;

public class VolatileTest {

	private VolatileTest() {
	}

	/**
	 * Java program to demonstrate where to use Volatile keyword in Java. In
	 * this example Singleton Instance is declared as volatile variable to
	 * ensure every thread see updated value for _instance.
	 */
	private static volatile VolatileTest INSTANCE; // volatile variable

	public static VolatileTest getInstance() {

		if (INSTANCE == null) {
			synchronized (VolatileTest.class) {
				if (INSTANCE == null) {
					INSTANCE = new VolatileTest();
					System.out.println("Instance created!");
				}
			}

		}
		return INSTANCE;

		// Read more:  http://javarevisited.blogspot.com/2011/06/volatile-keyword-java-example-tutorial.html#ixzz39n3mftLo
	}

	public void display() {
		System.out.println("Displaying the method.");
	}

	public static void main(String[] args) {
		VolatileTest.getInstance().display();
		VolatileTest.getInstance().display();
		VolatileTest.getInstance().display();
		VolatileTest.getInstance().display();
	}
}