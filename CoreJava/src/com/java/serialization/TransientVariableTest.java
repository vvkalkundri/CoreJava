package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientVariableTest {
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		NameStore nm = new NameStore("Vijay ", "Vasudev", "Kalkundri");
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(
				"temp.txt"));
		o.writeObject(nm);
		o.close();

//		ObjectInputStream o1 = new ObjectInputStream(new FileInputStream(
//				"temp.txt"));
//		NameStore nameStoreRead = (NameStore) o1.readObject();
//		System.out.println(nameStoreRead);

	}
}

class NameStore implements Serializable {
	private String FirstName;
	private transient String MiddleName;
	private String LastName;

	public NameStore(String Fname, String Mname, String Lname) {
		this.FirstName = Fname;
		this.MiddleName = Mname;
		this.LastName = Lname;
	}

	public String toString() {
		return ("First Name : " + this.FirstName + "  Middle Name : "
				+ this.MiddleName + "  Last Name : " + this.LastName);
	}
}
