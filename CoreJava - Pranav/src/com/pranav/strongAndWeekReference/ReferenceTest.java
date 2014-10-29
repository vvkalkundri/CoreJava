package com.pranav.strongAndWeekReference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenceTest {

	public static void main(String[] args) {
		
		/***STRONG AND WEAK REFERENCE***/
		String str = new String("MyString"); // This is a Strong reference.
		WeakReference<String> weakRef = new WeakReference<String>(str);// This has created weak reference for 'str'
		str = null; //now str is eligible for garbage collection
		
		/***STRONG AND WEAK REFERENCE***/
		String str1 = new String("MyString"); // This is a Strong reference.
		SoftReference<String> softRef = new SoftReference<String>(str1);// This has created soft reference for 'str1'
		str1 = null; //now Counter object is eligible for garbage collection but only be collected when JVM absolutely needs memory

		//Read more: http://javarevisited.blogspot.com/2014/03/difference-between-weakreference-vs-softreference-phantom-strong-reference-java.html#ixzz3DCau1hrh
	}
}
