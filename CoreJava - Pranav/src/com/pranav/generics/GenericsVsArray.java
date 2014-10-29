package com.pranav.generics;

public class GenericsVsArray {

	public static void main(String[] args) {
	
		Holder<String> holder = new Holder<String>(10);
		holder.add("Pranav");
		String name = holder.get();
		System.out.println("String Name: " + name);
		
		Holder<Integer> intHolder = new Holder<Integer>(5);
		intHolder.add(new Integer(20));
		int val = intHolder.get();
		System.out.println("Integer Value: " + val);
		int zz = Holder.identical(new Integer(25));
		System.out.println("zz: " + zz);
	}
}

/***Holder can hold any type***/
class Holder<T>{
	
	public T[] contents;
	private int index = 0;
	
	@SuppressWarnings("unchecked")
	public Holder(int size) {
		contents = (T[]) new Object[size];
	}
	
	public void add(T content){
		contents[index] = content;
	}
	
	public T get(){
		return contents[index];
	}
	
	public static <T> T identical(T source){
        return source;
	}

	public static <Integer> String iden(String source){
        return source;
	}

}
