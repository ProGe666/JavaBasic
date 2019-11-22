package com.mercury.congstructors;

public class Test1 {

	public static class Par{
		//constructors : function , no return type
		public Par(){
			System.out.println("Creating par");
		}
		public Par(int x){
			System.out.println("Creating par:" + x);
		}
	}
	//By default , the 1st line of each constructor is to call parent class's constructor - super()
	//super
	//
	public static class Sub extends Par{
		public Sub(){
			System.out.println("Creating sub");
		}
		public Sub(int x){
			super(x);//super object
			System.out.println("Creating sub:" + x);
		}
	}
	
	public static void main(String[] args){
		Par p = new Sub(1);
	}
	
}
