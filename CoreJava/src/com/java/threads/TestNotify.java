package com.java.threads;

public class TestNotify {

	public static void main(String[] args) {

		ThreadB t22 = new ThreadB();
		t22.start();

		synchronized (t22) {
			try {
				System.out.println("Waiting for B to Complete .....");
				t22.wait();
			} catch (InterruptedException ie) {
				System.out.println("The total value is :: " + t22.total);
			}
		}
	}
}

// Java puzzle / debugging / test scripts /

class ThreadB extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;

			}
			notify();

		}
	}
}
