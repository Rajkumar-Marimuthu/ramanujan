package com.rojatech.ramanujan.ch5.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(5000);
			throw new MyThreadException("my thread exception");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MyThreadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
