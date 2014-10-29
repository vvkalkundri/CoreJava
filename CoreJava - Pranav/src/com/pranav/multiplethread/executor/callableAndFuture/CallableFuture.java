package com.pranav.multiplethread.executor.callableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future<Long>> list = new ArrayList<Future<Long>>();

		for (int i = 0; i < 500; i++) {
			MyCallable callable = new MyCallable();
			Future<Long> future = executor.submit(callable);
			list.add(future);
		}

		System.out.println(list.size());

		int sum = 0;
		for (Future<Long> future : list) {
			try {
				sum += ((Long) future.get()).longValue();
			} catch (InterruptedException e) {
			} catch (ExecutionException e) {
			}
		}
		
		System.out.println("Final Sum: " + sum);
		executor.shutdown();
	}
}
