package com.java.innerclass;

public class AnnoymousInnerClass {
	public static void main(String[] args) {
		PopCorn p = new PopCorn();
		p.Pop();
		// This is used to invoke the inner popcorn class of the Food class
		Food f = new Food();
		f.p.Pop();
	}
}
class PopCorn {
	public void Pop() {
		System.out.println(" This is pop of popcorn class");
	}
}

class Food {
	PopCorn p = new PopCorn() {
		public void Pop() {
			System.out.println("This is pop of  Food class");
		}
	};

}