package com.pranav.generics;


public class SameTypeAndSubclassGenerics {
	public static void main(String[] args) {
		
		NumberType<Integer> numType = new NumberType<Integer>(5);
		numType.add(10);
		int val = numType.get();
		System.out.println("Val: " + val);
		
		/*NumberType<BigDecimal> longType = new NumberType<BigDecimal>(10);
		longType.add(new BigDecimal(100));
		BigDecimal bigDecimal = longType.get();
		System.out.println("Long Val: " + bigDecimal.intValue());*/
		
		//ERROR - Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type NumberType<T>
		//NumberType<String> strType = new NumberType<String>(5);
		
	}
}

class NumberType<T extends Number>{
	public T[] contents;
	private int index = 0;
	
	@SuppressWarnings("unchecked")
	public NumberType(int size) {
		contents = (T[]) new Object[size];
	}
	
	public void add(T content){
		contents[index] = content;
	}
	
	public T get(){
		return contents[index];
	}
}