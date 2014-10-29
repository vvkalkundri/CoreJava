package com.pranav.thread.join;

public class Thread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 1: "+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
