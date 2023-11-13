package com.rojatech.ramanujan.ch09.designpatterns.singleton;

public class SingletonClassDemo {

	public static void main(String[] args) {
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();
		System.out.println(instance1 == instance2);
	}
}
