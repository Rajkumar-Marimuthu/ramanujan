package com.rojatech.ramanujan.ch9.designpatterns.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> queue;
	
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			queue.put("Mac Pro");
			queue.put("Dell");
			queue.put("HP");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
