package com.pranav.abstractclass;

public class AbstractTest {

	public static void main(String[] args) {

		Animal dog = new Dog("Dog");
		dog.walk();
		
		// Error: Cannot instantiate the type Animal
		//Animal animal = new Animal("Animal");
	}
}

abstract class Animal {

	String name;

	/**
	 * ** Abstract class can have constructor if you want to override default constructor **
	 * 
	 *  It will be called by the subclass while object creation.
	 *  It can not be call, but it will be used internally.
	 */
	public Animal(String nm) {
		this.name = nm;
	}

	public abstract void walk();
}

class Dog extends Animal {

	public Dog(String nm) {
		super(nm + "-super");
	}

	@Override
	public void walk() {
		System.out.println(this.name + " is walking");
	}

}