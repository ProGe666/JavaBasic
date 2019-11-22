package com.mercury.basic;

public interface MyInterface {
	//in interface, by default , all functions should be abstract , cannot have a body
	//in interface,by default ,all fields are public static final
	int x =2;
	
	void x();
	//private void x(); not work
	//protected void x(); not work
	//void x() works because it is by default public, similar to abstract keyword in an interface

}
