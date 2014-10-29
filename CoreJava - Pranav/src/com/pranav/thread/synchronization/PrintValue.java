package com.pranav.thread.synchronization;

public class PrintValue {

	public static int i = 0;
	private volatile static PrintValue value;
	
	private PrintValue(){}
	
	public static PrintValue getInstance(){
		if(value == null){
			synchronized (PrintValue.class) {
				if(value == null){
					value = new PrintValue();
				}
			}
		}
		return value;
	}
	
	public void print(){
		System.out.println(i++);
	}
}
