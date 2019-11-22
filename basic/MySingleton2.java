package com.mercury.basic;

import java.io.Serializable;

public class MySingleton2 {
	
	private MySingleton2(){};
	private static class A{//inner static class
		private static MySingleton2 ms2 = new MySingleton2();
	}
	//class load do not run inner static class
	
	//reflection can call, then it will not be Singleton
	public static MySingleton2 getInstance(){
		return A.ms2;
	}
	
	
	

}
