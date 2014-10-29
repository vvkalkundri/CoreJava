package com.pranav.comparable;

import java.util.Arrays;

class Pets implements Comparable<Pets> {

	String name;

	public Pets(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Pets o) {
		if (o instanceof Pets) {
			return name.compareTo(o.getName());
		}
		throw new RuntimeException("Only works for Pets Class.");
	}

	@Override
	public String toString() {
		return name;
	}

}

class Cat extends Pets {

	public Cat(String name) {
		super(name);
	}
}

class Dog extends Pets {

	public Dog(String name) {
		super(name);
	}
}

public class TestComparable {
	public static void main(String arg[]) {
		Object[] pets = { new Dog("Max"), new Cat("Snow Ball"), new Dog("Brownie"), new Cat("Not so Brownie") };

		System.out.println("\nBefore Sorting:\n");
		displayHouse(pets);

		Arrays.sort(pets);

		System.out.println("\nAfter Sorting:\n");
		displayHouse(pets);
	}

	private static void displayHouse(Object[] pets) {
		for (Object pet : pets) {
			System.out.println(pet);
		}
	}
}
