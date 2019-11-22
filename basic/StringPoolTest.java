package com.mercury.basic;

public class StringPoolTest {

	public static void main (String args[]){
//		String s1 = "abc";
//		String s2 = "abc";
//		String s3 = new String("abd");
//		String s4 = new String("abc");
//		
//		System.out.println(s1==s2);
//		System.out.println(s2 == s3);
//		System.out.println(s3 == s4);
		
		String s5 = new String("xyz");// build two String; xyz build in String pool
		String s6 = s5.intern();
		String s7 = "xyz";
		System.out.println(s6==s7);
	}
}
