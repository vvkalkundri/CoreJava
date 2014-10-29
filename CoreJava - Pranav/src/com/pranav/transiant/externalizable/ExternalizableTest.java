package com.pranav.transiant.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableTest implements Externalizable{

	private int orderId = 10;
	private String name = "Pranav";
	private int noOfItems = 2;
	private int price = 100;
	private transient int total = 10;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeInt(getOrderId());
		out.writeUTF(getName());
		out.writeInt(getNoOfItems());
		out.writeInt(getPrice());
		out.writeInt(getTotal());
		
		out.flush();
		out.close();
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		int orderId = in.readInt();
		String orderName = in.readUTF();
		int noItems = in.readInt();
		int price = in.readInt();
		int total = in.readInt();
		
		System.out.println(orderId);
		System.out.println(orderName);
		System.out.println(total);
		
		in.close();
		
	}

}
