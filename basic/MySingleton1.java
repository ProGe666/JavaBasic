package com.mercury.basic;
//eager Singleton
public class MySingleton1 {
	private MySingleton1(){};
	private static MySingleton1 ms1 = new MySingleton1();
	
	public static MySingleton1 getInstance(){
		return ms1;
	}
	
	

	// class loading
	//1.class load === put in pram gen
	//2.class init === build static field
}
