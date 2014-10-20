package com.java.threads;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Collection  class that is synchronised is thread safe.

public class ThreadSafeClass {
	private List<String> names = Collections
			.synchronizedList(new LinkedList<String>());

	public void add(String name) {
		names.add(name);
	}

	public String removeEle() {
		if (names.size() > 0) {
			names.remove(0);
		}
		return null;
	}

	public static void main(String[] args) {
		final ThreadSafeClass t1 = new ThreadSafeClass();
		t1.add("Vijay");

		class nameDropper implements Runnable {
			public void run() {
				String name = t1.removeEle();
				System.out.println("Element removed is : " + name);
			}
		}
		nameDropper nd = new nameDropper();
		Thread tr1 = new Thread(nd);
		Thread tr2 = new Thread(nd);

		tr1.start();
		tr2.start();
	}
}
