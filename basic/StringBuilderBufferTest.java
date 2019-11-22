package com.mercury.basic;

public class StringBuilderBufferTest {
	public static void main(String[]args){
		String s1 = "abc";
		String s2 = s1 +"xyz";
		System.out.println(s1 == s2);
		System.out.println("*************");
		
		
		//Builder:build instance piece by piece
		StringBuilder sb = new StringBuilder();// StringBuilder return themself;
//		sb.append("abc");
//		sb.append("xyz");
		StringBuilder sb1 =sb.append("abc");
		StringBuilder sb2 =sb.append("xyz");
		
		System.out.println(sb);
		
		System.out.println(sb ==sb1);
		System.out.println(sb1 ==sb2);
		
		
		System.out.println("*************");
		
		//StringBuffer thread safe === slow, so StingBuilder is more popular
		StringBuffer sbf = new StringBuffer();
		sbf.append("asdf");
		
	}
}
