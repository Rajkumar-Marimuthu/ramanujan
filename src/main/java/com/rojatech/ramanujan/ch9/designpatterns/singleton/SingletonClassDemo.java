package com.rojatech.ramanujan.ch9.designpatterns.singleton;

public class SingletonClassDemo {

	public static void main(String[] args) {
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();
		
		System.out.println(instance1 == instance2);
		
	}

}
