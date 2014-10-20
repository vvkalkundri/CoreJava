package com.java.genericsandcollection;

import java.util.HashMap;
import java.util.Map;

class DogAnimal {
	String name;

	DogAnimal(String n) {
		name = n;
	}

	public boolean equals(Object o) {
		if ((o instanceof DogAnimal) && ((DogAnimal) o).name == name) {
			return true;
		} else
			return false;
	}

	public int hashCode() {
		return name.length();
	}

	public String toString() {
		return name;
	}
}

enum Pets {
	CAT, HORSE
};

public class MapTest {
	public static void main(String[] args) {
		Map<Object, Object> m1 = new HashMap<Object, Object>();
		m1.put("k1", new DogAnimal("Pinky"));
		m1.put("k2", Pets.CAT);
		DogAnimal da = new DogAnimal("snappy");
		m1.put("k3", da);
		System.out.println(m1.get("k3"));
		System.out.println("******************************");
		DogAnimal d1 = new DogAnimal("clover");
		d1.name = "mangolia";
		m1.put(d1, "DogAnimal Key");
		System.out.println(m1.get(d1));
	}
}
