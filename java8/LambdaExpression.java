package com.mercury.java8;

import java.util.Comparator;
import java.util.TreeMap;

public class LambdaExpression {
	

	public static class A implements MyFuncitonalInterface{
		public void foo(){
			System.out.println("A foo");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFuncitonalInterface mfi = new A();
		mfi.foo();
		System.out.println("*************");
		
		MyFuncitonalInterface mfi2 = new MyFuncitonalInterface (){
			@Override
			public void foo(){
				System.out.println("Anonymous foo");
			}
		};
		mfi2.foo();
		
		System.out.println("**********");
		//lambda expression: shorten the anonymous way of implementation a funtiocal interface
		
		//new is a function
		
		//lambda function
		//lambda function left must have something
		MyFuncitonalInterface mfi3 = () -> System.out.println("Anonymous foo");
	}
		Runnable r = () -> System.out.println(23);

		Comparable cc = o -> 0;
		//if return value , just return the value 
		//if only have one paremiter, we can eliminate the (),just use o
		
		Comparator ct = (o1,o2) -> 0;
//		Comparator<Object> byName = 
//		(Object o1, Object o2)->o1.getName().compareTo(o2.getName());
//		Comparator ct = (o1,o2) -> o1.hashCode() - o2.hashCode();
//		lambda expression only defined the function, you need call them

		TreeMap tm = new TreeMap((o1,o2) -> o1.hashCode() -o2.hashCode());
		
		
		
		
	
}

