// we are using predefined functional interface Runnable to refer static method.
package com.rojatech.ramanujan.ch3.streams;

public class MethodReferenceDemo2 {
	
	public static void threadStatus() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		
		Thread th = new Thread(MethodReferenceDemo2::threadStatus);
		th.start();

	}

}
