package com.pranav.multiplethread.executor;

public class MyRunnable implements Runnable {

	private final long count;

	public MyRunnable(long count) {
		this.count = count;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum++;
		}
		System.out.println(Thread.currentThread() + "-" +sum);
	}

}
