package com.java.genericsandcollection;

import java.util.*;

class Dog {
	String name;

	Dog(String n) {
		name = n;
	}

	public String toString() {
		return name;

	}
}

class ListIterator {
	public static void main(String[] args) {
		List<Dog> d1 = new ArrayList<Dog>();
		Dog dg = new Dog("browny");
		d1.add(new Dog("tommy"));
		d1.add(new Dog("Pinky"));
		d1.add(dg);
		// Iterate through the dog collection and get the contents
		Iterator<Dog> i1 = d1.iterator();
		while (i1.hasNext())
			System.out.println(i1.next());

		System.out.println("size of the list is : " + d1.size());
		System.out.println("Get the content of the second item :"
				+ d1.get(1).name);
		System.out
				.println("---Converting to object array and printing the contents ---");
		Object[] o2 = d1.toArray();
		for (Object object : o2) {
			Dog d2 = (Dog) object;
			System.out.println(d2.name);
		}

	}

}
