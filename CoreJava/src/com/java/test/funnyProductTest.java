package com.java.test;

public abstract class funnyProductTest {

	public int getNum() {
		return 45;
	}

	public abstract class Bar {
		public int getNum() {
			return 38;
		}
	}

	public static void main(String[] args) {
		
		
		funnyProductTest ft = new funnyProductTest() {
			public int getNum() {
				return 22;
			}
		};
		
		funnyProductTest.Bar fb = ft.new Bar(){
			public int getNum(){
				return 57;
			}
		};
		System.out.println( fb.getNum() + " " + ft.getNum());
	}
}
