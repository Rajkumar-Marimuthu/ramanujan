package com.rojatech.ramanujan.ch04.concurrency;

public class MyThread implements Runnable {

	int sum;

	@Override
	public void run() {
		System.out.println("Child thread sum calcualtion: ");
		synchronized(this) {
			for (int i=1; i<=100; i++) {
				sum += i;
			}
			this.notify();
		}
	}
}
