package com.pranav.multiplethread.deadlock.solution;

public class DeadLockResolutionTest {
	public static void main(String[] args) {

		final A a = new A();
		final B b = new B();

		Runnable block1 = new Runnable() {

			@Override
			public void run() {
				
				/**First Obtained lock on 'b' instead of 'a' and then obtain lock on 'a' **/
				
				synchronized (b) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					// waiting for resource 'b' to complete
					synchronized (a) {
						System.out.println("In block 1");
					}
				}
			}
		};

		Runnable block2 = new Runnable() {

			@Override
			public void run() {
				synchronized (b) {

					// Wating for resource 'a' to complete
					synchronized (a) {
						System.out.println("In block 2");
					}
				}
			}
		};

		new Thread(block1).start();
		new Thread(block2).start();
	}
}

class A {
	private int i = 100;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}

class B {
	private int i = 200;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
