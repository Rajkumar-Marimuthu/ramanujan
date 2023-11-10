// Synchronized method
package com.rojatech.ramanujan.ch4.concurrency;

class Counter {
	int count;
	
	// only one thread can work at a time
	//public  void increment() {
	public synchronized void increment() {
		count++;
	}
}
public class SynchrnoizedDemo {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread (() -> {
			for (int i=0; i<1000;i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread (() -> {
			for (int i=0; i<1000;i++) {
				c.increment();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count " + c.count);
	}

}
