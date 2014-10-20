package com.java.genericsandcollection;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionBinarySearch {
	public static void main(String[] args) {
		String[] sa = { "one", "two", "three", "four" };
		for (String string : sa)
			System.out.print(string + " ");
		System.out.println();
		// Sorting the array using the inbuilt sorting function
		Arrays.sort(sa);

		for (String string : sa)
			System.out.print(string + " ");
		System.out.println();
		// inbuilt binary search is used for searching the content
		int pos = Arrays.binarySearch(sa, "awo");
		System.out.println(pos);
		System.out.println("Actual position will be " + (-(pos + 1)));

		// Reverse Sort the sorted array
		System.out.println(" Reverse sorting the string Array");
		ReverseSortArray ra = new ReverseSortArray();
		Arrays.sort(sa, ra);
		for (String string : sa) {
			System.out.print(string + " ");
		}
		System.out.println();

		System.out.println("One :" + Arrays.binarySearch(sa, "one", ra));

	}

	static class ReverseSortArray implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}

	}
}
