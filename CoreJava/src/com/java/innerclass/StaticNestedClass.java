package com.java.innerclass;

public class StaticNestedClass {

	static class Nest {
		void go() {

			System.out.println("This is a static nested class in Main class");
		}

		public static void main(String[] args) {
			BigOuter.BigInner bobi = new BigOuter.BigInner();
			bobi.goBigInner();

			Nest n1 = new Nest();
			n1.go();
		}
	}
}

class BigOuter {
	static class BigInner {
		void goBigInner() {
			System.out.println("This is a static class in the Big Ineer");
		}
	}
}