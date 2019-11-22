package com.mercury.basic;

public enum Direction {

	//possible value
	//only can priv-defined value 
	East;
	int x =2;
	//no instance field

	
	public static void foo(){
		System.out.println("Direction foo");
	}
	public void bar(){
		System.out.println("East bar");
	}
}
