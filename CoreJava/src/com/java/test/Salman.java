package com.java.test;

public class Salman implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getId());
		//move(Thread.currentThread().getId());
	}

	synchronized void move(long id) {
		System.out.print(id + " ");
		System.out.print(id + " ");
	}

	public static void main(String[] args) {
		Salman sn = new Salman();
//		sn.run();
		new Thread(new Salman()).start();
	//	new Thread(new  Salman()).start();
	}
}
