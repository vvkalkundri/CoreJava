package com.java.threads;

public class SynchronizedBlock {
	public static void main(String[] args) {
		SynchronisedBlockTest sbt = new SynchronisedBlockTest();
		Thread sb = new Thread(sbt);
		sb.setName("Thread 1 ");
		Thread sb2 = new Thread("sb");
		sb2.setName("Thread 2");

		sb.start();
		sb2.start();

	}

}

class SynchronisedBlockTest implements Runnable {

	public void run() {
		synchronized (this) {

			System.out.println("Syncroniseddddddd!!!!!! ::: " + " Name is : "
					+ Thread.currentThread().getName());
		}

	}

}