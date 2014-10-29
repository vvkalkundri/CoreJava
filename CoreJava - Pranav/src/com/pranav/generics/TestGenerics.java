package com.pranav.generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestGenerics {

	public static void main(String[] args) {
		// Simple use of Generics
		Set<String> strSet = new HashSet<String>();
		Set<Integer> intSet = new HashSet<Integer>();
		
		//Error - cannot convert from HashSet<Object> to Set<String>
		//strSet = new HashSet<Object>();
		
		// Row type of Set
		Set setOfRowType = new HashSet<String>();
		setOfRowType = new HashSet<Integer>();
		
		// Set<?> - set of unknown type
		Set<?> unknownType = new HashSet<String>();
		unknownType = new HashSet<Integer>();
		
		// Set<Object> - set of any type. 
		Set<Object> setOfAnyType = new HashSet<Object>();
		setOfAnyType.add("abc");
		setOfAnyType.add(new Integer(2));
		
		// Parameterized Type also follow Inheritance
		Set<String> setOfString = new HashSet<String>(); //valid in Generics
		setOfString = new LinkedHashSet<String>(); // Ok

		// Error - Type mismatch: cannot convert from HashSet<String> to Set<Object>
		//Set<Object> typeObject = new HashSet<String>();
		
		//Set<? extends Number> will store either Number or sub type of Number like Integer, Float.
		Set<? extends Number> numSet = new HashSet<Integer>();
		numSet = new HashSet<Float>();
		
	}
}
