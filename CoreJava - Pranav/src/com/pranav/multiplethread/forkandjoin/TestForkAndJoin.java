package com.pranav.multiplethread.forkandjoin;

import java.util.concurrent.ForkJoinPool;

public class TestForkAndJoin {

	public static void main(String[] args) {
		Problem problem = new Problem();
		Solver solver = new Solver(problem.getList());
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		ForkJoinPool pool = new ForkJoinPool(availableProcessors);
		pool.invoke(solver);
		long result = solver.getResult();
		System.out.println("Result" + result);
		
		// check if the result was ok
		long sum = 0;
	    for (int i = 0; i < problem.getList().length; i++) {
	      sum += problem.getList()[i];
	    }
	    System.out.println("Done. Result: " + sum);
	}
}
