package com.pranav.multiplethread;

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
			
			if(sum > 10000){
				break;
			}
		}
		System.out.println(sum);
	}

}
