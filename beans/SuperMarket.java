package com.mercury.beans;

import java.util.List;

public class SuperMarket implements Cloneable{
	private String name;
	private String address;
	private List<String> product;
	public SuperMarket(String name, String address, List<String> product){
		super();
		this.name = name;
		this.address = address;
		this.product = product;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getProduct() {
		return product;
	}
	public void setProduct(List<String> product) {
		this.product = product;
	}
	@Override
	public SuperMarket clone(){
		try {
			 super.clone();//retrun an object
			 //sm= (SuperMarket)super.clone(); 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//return sm;
		return new SuperMarket(name, address, product); //Shallow Copy 
		
	}
	@Override
	public String toString() {
		return "SuperMarket [name=" + name + ", address=" + address + ", product=" + product + "]";
	}
	
}
