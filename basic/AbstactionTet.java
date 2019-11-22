package com.mercury.basic;

public class AbstactionTet {

	//abstract ---- concrete
	//abstract function : no implementation at all, unfinished;
	
	abstract public static class Par{
		public void x(){
			//empty implementation
		}
		//public void y();  this is abstract function;
		abstract public void y();
		
	}
	//Sub class will extends non-static function from par class
	public static class Sub extends Par{
		public void y(){
			System.out.println("Sub y");
		}
		
	}
	public static class B{
		
	}
	//not necessary to have any abstract function in an abstract class
	//abstract class may don't have any abstract function
	abstract public static class A extends B{
		public void foo(){
			
		}
	}
	public static class C implements MyInterface{
		@Override
		public void x(){
			
		}
	}
	//or
	/*
	 *abstract public static class C implements MyInterface{}
	 * 
	 * */
	public static void main(String[] args){
		//can not follow an unfinished blueprint to create an object
		
	}
}
