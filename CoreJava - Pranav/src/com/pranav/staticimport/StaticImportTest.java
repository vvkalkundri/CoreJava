package com.pranav.staticimport;

//Import public static fields of any class and then use it directly in the class
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class StaticImportTest {

	public static void main(String[] args) {
		System.out.println("Integer MAX_VALUE: " + MAX_VALUE);
		System.out.println("Integer MIN_VALUE: " + MIN_VALUE);
	}
}
