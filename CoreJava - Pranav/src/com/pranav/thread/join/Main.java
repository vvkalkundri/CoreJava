package com.pranav.thread.join;

public class Main {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		try {
			t1.join(); // t1 thread will finish first before control is coming to main thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("before t2");
		t2.start();
		
	}
}
