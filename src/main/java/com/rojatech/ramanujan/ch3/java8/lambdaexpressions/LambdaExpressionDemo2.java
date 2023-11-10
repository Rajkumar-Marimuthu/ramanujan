package com.rojatech.ramanujan.ch3.java8.lambdaexpressions;

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		String name = "WelcomeJava";
		Runnable r1 = () -> System.out.println(name);
		String name1 = name.toUpperCase();
		Runnable r2 = () -> System.out.println(name1);
		
		
		r1.run();
		
		r2.run();
	}

}