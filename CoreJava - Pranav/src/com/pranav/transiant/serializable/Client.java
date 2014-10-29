package com.pranav.transiant.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) {
		SerializableTest test = new SerializableTest();
		test.setOrderId(1);
		test.setName("Gothadiya");
		test.setTotal(500);
		
		
		//Serialization part
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/TestSerializable.ser"));
			out.writeObject(test);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//De-seialization part
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("C:/TestSerializable.ser"));
			SerializableTest deTest = (SerializableTest)in.readObject();
			System.out.println("Name: " + deTest.getName());
			System.out.println("OrderID: " + deTest.getOrderId());
			System.out.println("Total: " + deTest.getTotal());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
