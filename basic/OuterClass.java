package com.mercury.basic;

public class OuterClass {

	public class InnerClass1{
		
	}
	public static class InnerClass2{
		
	}
	
	
	
	public static void main(String arg[]){

		OuterClass oc = new OuterClass();
		//Static inner class can be treated same way as an outer class
		OuterClass.InnerClass2 oi2 = new OuterClass.InnerClass2();
		OuterClass.InnerClass1 oi1 = oc.new InnerClass1();
		
	}
}
