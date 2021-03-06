package com.java.threads;

public class SimpleThread {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);
		t1.setName("Yahoo!!");
		t1.start();
		t2.setName("Gmailll!!!");
		t2.start();
		t3.setName("Amazon");
		t3.start();

	}
}

class MyRunnable implements Runnable {

	public void run(String name) {
		System.out.println("The thread is running in MyRunnable : " + name);
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out
					.println("This is just running thread and the iteration count is : "
							+ i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}