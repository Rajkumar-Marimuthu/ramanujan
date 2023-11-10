package com.rojatech.ramanujan.ch9.designpatterns.singleton;

public class SingletonClass {
	
	private static SingletonClass instance;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		} 
		return instance;
	}

}
