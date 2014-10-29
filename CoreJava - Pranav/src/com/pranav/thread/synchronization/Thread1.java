package com.pranav.thread.synchronization;

public class Thread1 implements Runnable{

	Thread t = null;
	PrintValue print = null;
	public Thread1() {
		t = new Thread(this);
		print = PrintValue.getInstance();
		t.start();
	}
	@Override
	public void run() {
		System.out.println("Hi 1");
		
		if(print.i %2 == 0){
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
