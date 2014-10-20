package com.java.innerclass;


public class InnerClassCreate {
	public static void main(String[] args) {
		// 1 way 
		MyOuter my = new MyOuter();
		MyOuter.MyInner 	inner = my.new MyInner();
		
		// 2nd way
		MyOuter.MyInner inner2 = new MyOuter().new MyInner();
		
		inner.seeOuter();
		inner2.seeOuter();
	}

}

class MyOuter{
	private int x=7;
	public void makeInner(){
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	class MyInner{
		public void seeOuter(){
			System.out.println(x);
		}
	}
}