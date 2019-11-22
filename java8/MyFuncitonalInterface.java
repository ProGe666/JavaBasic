package com.mercury.java8;
@FunctionalInterface
//only one
//function interface === this interface do some function
//e.g. runnable ,callable,comparable;
public interface MyFuncitonalInterface {
	//no matter how many static/default function this interface has,
	//as long as only 1 abstract method, this is a functional interface
	
	void foo();
	static void bar(){
		System.out.println();
	}

}
