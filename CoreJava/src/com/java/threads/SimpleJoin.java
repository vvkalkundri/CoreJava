package com.java.threads;

public class SimpleJoin {
	public static void main(String[] args) {
		JoinTest jt = new JoinTest();

		Thread a1 = new Thread(jt);
		Thread b1 = new Thread(jt);

		a1.setName("a");
		a1.start();
		b1.setName("b");
		b1.start();

	}

}

class JoinTest implements Runnable {
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out
					.println(" Running the thread :  "
							+ Thread.currentThread().getName() + " " + i
							+ " : counter");
			if (Thread.currentThread().getName() == "b" && i == 10) {
				try {
					Thread.currentThread().join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}