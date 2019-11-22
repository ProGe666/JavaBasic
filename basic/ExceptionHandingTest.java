package com.mercury.basic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionHandingTest {
	public static void foo() /*throws FileNotFoundException*/{
		//static trace
//		try{
//			
//		}catch(Exception e){	
//			
//		}
		//try catch : deal with this exception immediately, right here ,right now
		try {
			FileOutputStream fos = new FileOutputStream("Address");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(3);
		throw new StackOverflowError("ABC");//it is a class
		//System.out.println(4);
	}
	public static void finallyTest(){
		//Finally is a java keyword, can be used after try/try-catch
		//no matter what happened in try/try-catch block, finally block will always be executed
		//unless JVM is shutdown
		
		// Normally use for closing
		
		//throw new NullPointerException();
		FileOutputStream fos = null;
		try{
			System.exit(0);
			//throw new NullPointerException();
			fos = new FileOutputStream("");
			fos.write(1);
			
			String s =null;
			System.out.println(s.toString());
		}catch(Exception e){
			e.printStackTrace();
			}finally{
				if(fos != null){
					try{
						fos.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		
	}
	public static class MyResource implements AutoCloseable{
		@Override
		public void close() throws Exception{
			System.out.println("Closing my resource");
		}
	}
	
	
	public static void testTryWithResources(){
		//try with resource
		//resource : some that implement AutoCloseable
		try(FileOutputStream fos = new FileOutputStream("")){
			//no exception 执行try
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void  main(String[] args){
//		System.out.println(1);
//		//foo();
//		//have error
//		try{
//			foo();
//		}catch(Throwable e){
//			e.printStackTrace();
//		}
//		System.out.println(2);
		testTryWithResources();
	}

}
