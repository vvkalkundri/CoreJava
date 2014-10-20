package com.java.genericsandcollection;

import java.util.TreeSet;

public class TreeTest {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1205);
		ts.add(1505);
		ts.add(1545);
		ts.add(1830);
		ts.add(2010);
		ts.add(2100);
		System.out.println("To check the behavior of lower : " +ts.lower(1545));
		System.out.println("To check the behavior of higher : "+ts.higher(1830));
		
		System.out.println("To check the behavior of floor : "+ts.floor(1545));
		System.out.println("To check the behavior of ceiling :" +ts.ceiling(1830));
		
		
	}
}
