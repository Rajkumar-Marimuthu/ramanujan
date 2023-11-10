// a singleton class is a class that can have only one object (an instance of the class) at a time. 
// Early instantiation
package com.rojatech.ramanujan.ch9.designpatterns.singleton;

public class SingletonDemo {
	
	//private static SingletonDemo singletonDemo = new SingletonDemo();
	public static SingletonDemo singletonDemo;
	
	static {
		singletonDemo = new SingletonDemo();
	}
	
	private SingletonDemo() {
		System.out.println("SingletonDemo() called");
	}
	
	/*
	 * public static SingletonDemo getSingletonDemo() { return singletonDemo; }
	 */

	public static void main(String[] args) {
		SingletonDemo sd = new SingletonDemo();
		System.out.println(sd);
		SingletonDemo sd1 = new SingletonDemo();
		System.out.println(sd1);

	}

}
