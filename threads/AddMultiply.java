package com.mercury.threads;

import java.util.concurrent.Future;

public class AddMultiply {
	
	public static class Add implements Runnable {
		private int x, y;
		private int res;
		
		private Object t;
		
		public Add(int x, int y, Object t) {
			super();
			this.x = x;
			this.y = y;
			this.t = t;
		}

		@Override
		public void run() {
			synchronized(t) {
				res = x + y;
				
				// notify 1 thread back, whichever is waiting for t
				t.notify();		// the thread created by ta will notify
			}
		}
		
		public int getRes() {
			synchronized(t) {
				while(res == 0) {
					try {
						// wait() can only be called in a sync environment
						// from the ticket / lock object
						
						// waive the ticket / lock, and the thread will wait here
						// until next time get the lock
						t.wait();	// main will wait for t
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
			return res;
		}
	}
	
	public static class Mul implements Runnable {
		private int x, y;
		private int res;
		
		private Object t;
		
		public Mul(int x, int y, Object t) {
			super();
			this.x = x;
			this.y = y;
			this.t = t;
		}

		@Override
		public void run() {
			synchronized(t) {
				res = x * y;
				t.notify();
			}
		}
		
		public int getRes() {
			synchronized(t) {
				while(res == 0) {
					try {
						t.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			return res;
		}
	}

	public static void main(String[] args) {
		int x = 3;
		int y = 6;
		
		Object t = new Object();
		
		Add a = new Add(x, y, t);
		Mul m = new Mul(x, y, t);
		
		Thread ta = new Thread(a);
		Thread tm = new Thread(m);
		
		ta.start();
		tm.start();
		
//		try {
//			// current thread will wait until the joined thread finish, then continue to run
//			ta.join();
//			tm.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(m.getRes() - a.getRes());
	}

}
