package com.mercury.basic;

import com.mercury.beans.User;
import com.mercury.beans.Customer;
public class TestFinal {
	//final is a java keyword, can be added in front of a class/function /field
	//final class can not be extended
	//final function cannot be overridden
	//final field cannot be changed/reassigned

	//how to assign value for a final field
	
	//1.static final field: must assign value before runtime
	
	//1.1 assign value when declare
	public static final int x =2;
	
	//1.2 assign value in static block
	public static final int y;//before use, must have value
	
	//static block will be executed when class is loaded
	static{
		y=2;
	}
	
	
	//non-static final field 通过object使用-  must assign before the finished of object creation
	
	//2.1 assign when declare
	public final int m=2;
	//2.2 assign in all constructors
	public final int n;
	
	public TestFinal(){
		n=2;
	}
	public TestFinal(int x){
		n=x;
	}
	//2.3 assign in block
	public final int k;
	{
		k=5;
	}
	
	//final only make sure the reference can note be modified
	public static final User u = new User();
	
	public static Customer c = new Customer();
	
	public static void main(String[] args){
		u.setAge(10);
		System.out.println(u.getAge());
		u.setAge(20);
		System.out.println(u.getAge());
		
		
		c = new  Customer();
		
	}
}
