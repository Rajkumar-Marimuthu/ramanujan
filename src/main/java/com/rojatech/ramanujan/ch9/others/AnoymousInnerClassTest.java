package com.rojatech.ramanujan.ch9.others;

public class AnoymousInnerClassTest {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("New Thread created");
			}
		}).start();

	}

}
