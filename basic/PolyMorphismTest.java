package com.mercury.basic;
//Overload: 2 or more function in the same function name

public class PolyMorphismTest {
	public void x(){
		
	}

	public static class A{
		public void foo(){
			System.out.println("A foo");
		}
	}
	public static class B extends A{
		@Override
		public void foo(){
			System.out.println("B foo");
		}
		public void bar(){
			System.out.println("B bar");
		}
	}
	public static class C extends B{
		@Override
		public void foo(){
			System.out.println("C foo");
		}
		public void bar(){
			System.out.println("C bar");
		}
		//overload
		public void test(){
			System.out.println("C test");
		}
	}
	public static void main(String[] args){
		//TODO Auto-generated method stub
		
		//4 object constructors have been called, A,B,C object
		
		B b = new C();
		
		//call the methods of the object
		b.foo();
		b.bar();
		
		A a = b;
		a.foo();
		//not work a bar();
		C c= (C) b;
		c.foo();
		c.bar();
	}
}
