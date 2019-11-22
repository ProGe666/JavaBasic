package com.mercury.threads;

public class SyncTest {
	
	public static int x = 0;
	
	// synchronized is a java keyword, can be added in front of a function / block
	synchronized public static void a() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is running a()");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		x++;
		
		System.out.println(name + " complete a() " + x);
	}
	
	synchronized public static void b() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is running b()");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " complete b() " + x);
	}
	
	synchronized public void c() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is running c()");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " complete c() " + x);
	}
	
	synchronized public void d() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is running d()");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " complete d() " + x);
	}
	
	public static class MyThread extends Thread {
		
		SyncTest st;
		
		@Override
		public void run() {
			st.a();
		}
	}

	public static void main(String[] args) {
		SyncTest st = new SyncTest();
		
		
		MyThread mt = new MyThread();
		mt.st = st;
		
		mt.start();
		
		st.d();
	}

}
