package com.rojatech.ramanujan.ch04.concurrency;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread mtt = new Thread(mt);
		mtt.start();
		synchronized(mt) {
			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		System.out.println(mt.sum);
		
	}

}
