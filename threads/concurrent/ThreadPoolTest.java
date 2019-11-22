package com.mercury.threads.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {
	public static class Dummy implements Runnable{
		private int id;
		public Dummy(int id){
			this.id = id;
		}
		@Override
		public void run(){
			//System.out.println(id + "is runing");
			System.out.println(Thread .currentThread().getName() + "is running on mission" + id);
		}
	}
	
	public static void testDummy(){
		
		//no limitation
		//ExecutorService es = Executors.newCachedThreadPool();
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for(int i =0;i<100;i++){
			es.submit(new Dummy(i));
		}
		
		es.shutdown();
	}
	
	
	
	public static class Smart implements Callable<Integer>{
		private int id;
		public Smart(int id){
			this.id = id;
		}
		private int factorial(int nums){
			if(nums <2) return 1;
			else{
				return nums = factorial(nums -1);
			}
		}
		@Override
		public Integer call() throws Exception{
			return factorial(id);
		}
	}
	public static void testSmart(){
		ExecutorService es = Executors.newCachedThreadPool();
		//
		List<Future<Integer>> futures = new ArrayList();
		for(int i =0;i<=10;i++){
			Future<Integer> f = es.submit(new Smart(i));
			futures.add(f);
		}
		for(int i =0;i<futures.size();i++){
			Future<Integer> f = futures.get(i);
			while(!f.isDone()){
				
			}
			try{
				System.out.println(i+"factorial" + f.get());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		es.shutdown();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testDummy();
		System.out.println("*********");
		//testSmart();
	}

}
