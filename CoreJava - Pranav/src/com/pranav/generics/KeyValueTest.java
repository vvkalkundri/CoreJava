package com.pranav.generics;

import java.util.HashMap;

public class KeyValueTest {

	public static void main(String[] args) {
		MyMap<Integer, String> myMap = new MyMap<Integer, String>();
		myMap.put(1, "Pranav");
		String nm = myMap.get(1);
		System.out.println(nm);
	}
}

class MyMap<K extends Number, V> {

	HashMap<K, V> list = new HashMap<K, V>();

	public V get(K key) {
		return list.get(key);
	}

	public void put(K key, V value) {
		list.put(key, value);
	}
}
