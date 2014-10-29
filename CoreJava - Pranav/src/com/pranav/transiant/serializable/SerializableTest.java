package com.pranav.transiant.serializable;

import java.io.Serializable;

public class SerializableTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int orderId = 10;
	private String name  = "Pranav";
	private int noOfItems = 2;
	private int price = 100;
	private transient int total;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
