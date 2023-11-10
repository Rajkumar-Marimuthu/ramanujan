package com.rojatech.ramanujan.ch9.annotations;

public class MyChild extends MyParent {
	@Override
	public String greet(String name) {
		return "Hello " + name;
	}

}
