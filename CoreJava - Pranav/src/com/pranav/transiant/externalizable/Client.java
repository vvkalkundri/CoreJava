package com.pranav.transiant.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * with the Externalizable, transient variable's behavior can be overwritten.
 * @author gothadiy
 *
 */
public class Client {

	public static void main(String[] args) {
		ExternalizableTest test = new ExternalizableTest();
		test.setOrderId(2);
		test.setName("Hope");
		test.setTotal(1000);
		
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("c:/externalizableTest.ser"));
			test.writeExternal(out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("c:/externalizableTest.ser"));
			test.readExternal(in);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
