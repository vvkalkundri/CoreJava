package com.java.test;

public class Salman {
	public static void main(String[] args) {
		
		A a = new B();
		a.foo();
	}
}

class A{
	static void foo(){
		System.out.println("This is foo() in A");
	}
}

class B extends A{
	static void foo(){
		System.out.println("This is foo() in B");
	}
}