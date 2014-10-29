package com.pranav.multiplethread;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Thread> threads = new ArrayList<Thread>();

		for (int i = 0; i < 100; i++) {
			MyRunnable task = new MyRunnable(10000000L + i);
			Thread worker = new Thread(task);
			worker.setName(String.valueOf(i));
			worker.start();
			
			threads.add(worker);


			// All of the following method are deprecated and should not be used.
			worker.stop();
			worker.resume();
			worker.suspend();
				
		}

		int running = 0;

		do {
			running = 0;
			for (Thread thread : threads) {
				if (thread.isAlive()) {
					running++;
				}
			}
			//System.out.println("We have " + running + " running threads.");

		} while (running > 0);
	}
}
