package com.mercury.beans;

public class Luggage {
	private String brand;
	private int size;
	private int price;
	
	public Luggage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Luggage(String brand, int size,int price) {
		super();
		this.brand = brand;
		this.size = size;
		this.price =price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
	
	
//@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
//		result = prime * result + size;
//		return result;
//	}
////自动生成的
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Luggage other = (Luggage) obj;
//		if (brand == null) {
//			if (other.brand != null)
//				return false;
//		} else if (!brand.equals(other.brand))
//			return false;
//		if (size != other.size)
//			return false;
//		return true;
//	}
		@Override
	public int hashCode(){
		
		return 0;
			//return size + brand.hashCode();//brand  is string,use prime number to be the weight
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Luggage)){
			return false;
		}
		Luggage l = (Luggage) o;
		if(this.price == l.price
				&&this.size ==l.size// ==比较reference
				&&this.brand.equals(l.brand)){
		return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Luggage [brand=" + brand + ", size=" + size + "]";
	}
	
	
	

}
