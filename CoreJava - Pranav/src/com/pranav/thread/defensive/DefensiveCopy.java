package com.pranav.thread.defensive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DefensiveCopy {
	List<String> list = new ArrayList<String>();

	public void add(String s) {
		list.add(s);
	}

	/**
	 * Makes a defensive copy of the List and return it This way cannot modify
	 * the list itself
	 * 
	 * @return List<String>
	 */

	public List<String> getList() {
		return Collections.unmodifiableList(list);
	}
}