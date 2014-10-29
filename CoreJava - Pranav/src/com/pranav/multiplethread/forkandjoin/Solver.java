package com.pranav.multiplethread.forkandjoin;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class Solver extends RecursiveAction{
	private static final long serialVersionUID = 1L;
	private int[] arr;
	private long result;
	public Solver(int[] arr) {
		this.arr = arr;
	}
	
	@Override
	protected void compute() {
		if(this.arr.length == 1) {
			result = this.arr[0];
		} else {
			int mid = this.arr.length/2;
			int[] task1 = Arrays.copyOfRange(this.arr, 0, mid);
			int[] task2 = Arrays.copyOfRange(this.arr, mid, this.arr.length);
	 		Solver s1 = new Solver(task1);
	 		Solver s2 = new Solver(task2);
	 		invokeAll(s1, s2);
	 		result = s1.result + s2.result;
		}
	}
	
	public long getResult(){
		return result;
	}
	
}
