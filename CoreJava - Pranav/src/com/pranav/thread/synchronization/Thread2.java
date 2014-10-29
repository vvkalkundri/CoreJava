package com.pranav.thread.synchronization;

public class Thread2 implements Runnable {

	Thread t = null;
	PrintValue print = null;

	public Thread2() {
		t = new Thread(this);
		print = PrintValue.getInstance();
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Hi 2");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		if (print.i % 2 != 0) {
			synchronized (print) {
				print.notifyAll();
			}
			synchronized (print) {
				print.print();
				try {
					print.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} 
			
		



	}

}
