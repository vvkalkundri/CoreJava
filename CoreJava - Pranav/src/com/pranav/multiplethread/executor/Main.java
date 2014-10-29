package com.pranav.multiplethread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	/*
	 * Creating a thread class directly has the following disadvantage:
	 * 1. Creating a new thread causes performance overhead
	 * 2. Too many threads can lead to performance reduction and CPU need to switch between multiple threads.
	 * 3. You cannot simple control too many thread therefore you may run into out of memory errors.
	 * 
	 * To overcome above issues, java.util.concurrent package is evolved.
	 * 
	 * - Thread Pool manages the pool of worker threads. Thread pool contains a work queue which holds tasks to be completed.
	 */
	
	public static void main(String[] args) {

		// Executors class - Create a new Thread pool which created fixed 10 threads to execute tasks.
		// ExecutorService class - adds life cycle to the executor thread pool by providing shutdown() and awaitTermination() methods.
		ExecutorService executor = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 500; i++) {
			MyRunnable task = new MyRunnable(10000000L + i);

			// Add task (thread) to execute service pool
			executor.execute(task);
		}

	    // This will make the executor accept no new threads
	    // and finish all existing threads in the queue
		executor.shutdown();
		try {
			
			//	Wait until all threads are finished
			executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All threads are finished");
	}
}
