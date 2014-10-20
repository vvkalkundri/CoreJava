package com.java.threads;

public class JoinerTest {
	public static void main(String[] args) {
		JoinThreadA jta = new JoinThreadA();
		Thread ta = new Thread(jta);
		Thread tb = new Thread(jta);
		ta.setName("ThreadA");
		tb.setName("ThreadB");

		ta.start();
		tb.start();

		try {
			ta.join(7000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class JoinThreadA implements Runnable {

	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println(" The Thread that is running is : "
					+ Thread.currentThread().getName() + " at no " + i);

		}

		System.out.println("The thread that ended running was : "
				+ Thread.currentThread().getName());
	}
}