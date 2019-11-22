package com.mercury.java8;

public interface Java8Interface {

	public abstract void foo();
	
	// public 
	// public && one of the below
	// by default , it is abstract
	// static
	// default
	
	
	public static void bar() {
		//class level function
	}
	public default void test(){
		//object level function
	}
}
