package com.mercury.beans;

import java.io.Serializable;

public class Watch implements Serializable{
	
	//transient will hide this field during serialization
	//static field will not get serialized
	// only one special static field can be serialized
	
	
	private static final long serialVersionUID = 23456782359486L;
		//will be serialized; only way
	
	private String brand;
	transient private int price; //transient: hide element
	private String mat;
	
	public Watch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Watch(String brand, int price, String mat) {
		super();
		this.brand = brand;
		this.price = price;
		this.mat = mat;
	}
	
	public static String color = "write";
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", price=" + price + ", mat=" + mat + "]" + "Color";
	}
	
}
