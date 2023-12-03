package com.rojatech.ramanujan.ch03.java8.lambdaexpressions;

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		String name = "WelcomeJava";
		Thread th1 = new Thread(() -> System.out.println(name));
		String name1 = name.toUpperCase();
		Thread th2 = new Thread(() -> System.out.println(name1));
		
		
		th1.start();
		th2.start();
	}

}
