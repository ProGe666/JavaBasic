package com.mercury.threads;

public class DeadLock {
	
	public static class MyThread extends Thread {
		private int id;
		private Object t1, t2;
		
		public MyThread(int id, Object t1, Object t2) {
			this.id = id;
			this.t1 = t1;
			this.t2 = t2;
		}
		
		@Override
		public void run() {
			synchronized(t1) {
				System.out.println(id + " got " + t1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(t2) {
					System.out.println(id + " got " + t2);
				}
			}
		}
	}

	public static void main(String[] args) {
		Object t1 = new Object();
		Object t2 = new Object();
		
		MyThread mt1 = new MyThread(1, t1, t2);
		MyThread mt2 = new MyThread(2, t2, t1);
		
		mt1.start();
		mt2.start();
	}

}
