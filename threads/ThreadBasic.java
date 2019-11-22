package com.mercury.threads;

public class ThreadBasic {

	// 2 ways to create a thread
	
	
	// 1. need a Thread class
	// 2. to create a thread object
	// 3. then start a thread from the thread object by calling start()
	
	public static class MyThread1 extends Thread {
		@Override
		public void run() {
			System.out.println("MyThread1 start...");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("MyThread1 stopped!");
		}
	}
	
	
	public static class MyRunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("MyRunnable start...");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("MyRunnable stopped!");
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " started!");	// print out current thread's name
		
//		MyThread1 mt1 = new MyThread1();
//		
//		mt1.setDaemon(true);
//		
////		mt1.run();
//		mt1.start();	// start() will create a new thread, and execute the run() inside this new thread
		
		
		MyRunnable mr = new MyRunnable();
//		mr.run();
		
		new Thread(mr).start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main complete!");
	}
}