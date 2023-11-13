package com.rojatech.ramanujan.java16.proxy;

public interface Worker {
	default public void workerjob() {
		System.out.println("worker job is good.");
	}
}
