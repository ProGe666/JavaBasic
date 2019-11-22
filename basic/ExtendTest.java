package com.mercury.basic;

public class ExtendTest {

	public static class Par{
		
		String s = "abc";
		public static void foo(){
			System.out.println("Par foo");
		}
		public static void bar(){
			System.out.println("Par bar");
		}
		public void x(){
			System.out.println("Par x");
		}
		public void y(){
			System.out.println("Par y");
		}
		
	}
	public static class Sub extends Par{
		@Override
		public void x(){
		
			System.out.println("Sub x");
		}
		//Static function can not be Overridden
		public static void foo(){
			System.out.println("Sub foo");
		}
		
	}
	public static void main(String[] args){
		Par p = new Par();
		p.x();
		Par.foo();
		
		//if the object is not find ,it will search the reference type
		// in this case, the object level function has not been found, then the par will be searched
		//p.foo();
		
		System.out.println("*******************");
		Sub s = new Sub();
		s.x();
		s.y();
		
		//first directly search object from s ,then search Sub not find, then search parent Par
		
	}
}
