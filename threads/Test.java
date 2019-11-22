package com.mercury.threads;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		String a = "abc";
		String b = "xyz";
		
		// Thread hang up
		
		synchronized(b) {
			try {
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Complete");
	}

}
