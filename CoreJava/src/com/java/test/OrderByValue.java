package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderByValue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 3);
		map.put("c++", 2);
		map.put("R", 4);
		map.put("Big data", 1);
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
				set);
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());

		}

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		System.out.println("***********************************");

		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());

		}
		System.out.println("***********************************");

	}
}
