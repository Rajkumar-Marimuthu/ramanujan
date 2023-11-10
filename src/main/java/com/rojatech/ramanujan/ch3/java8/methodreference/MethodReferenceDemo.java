package com.rojatech.ramanujan.ch3.java8.methodreference;

public class MethodReferenceDemo {

	public static void method() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread ");
		}
	}
	public static void main(String[] args) {
		Runnable r = MethodReferenceDemo::method;
		
		Thread th = new Thread(r);
		th.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Parent Thread ");
		}
	}

}
