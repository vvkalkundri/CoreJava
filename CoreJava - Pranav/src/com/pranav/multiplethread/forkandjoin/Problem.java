package com.pranav.multiplethread.forkandjoin;

import java.util.Random;

public class Problem {
	private final int[] list = new int[200];

	public Problem() {
		Random random = new Random(1000000L);
		for (int i = 0; i < list.length; i++) {
			list[i] = random.nextInt() + i;
		}
	}

	public int[] getList() {
		return list;
	}
}
