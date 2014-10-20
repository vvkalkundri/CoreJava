package com.java.genericsandcollection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {

		boolean[] ba = new boolean[5];
		//Set makes sense as it nit sorted by default
		Set S = new HashSet();
		// TreeSet will throw a error as the contents have to be comparable
		// Set S = new TreeSet();
		ba[0] = S.add("pinky");
		ba[4] = S.add("meow ");
		ba[1] = S.add(new Integer(2));
		ba[2] = S.add("pinky");
		ba[3] = S.add("browny");
		
		for (int i = 0; i < ba.length; i++) {
			System.out.print(ba[i] + " ");
		}
		System.out.println();
		for (Object object : S) {
			System.out.println(object);
		}

	}
}
