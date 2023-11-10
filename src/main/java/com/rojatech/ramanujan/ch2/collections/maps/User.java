package com.rojatech.ramanujan.ch2.collections.maps;

public class User {

	@Override
	public String toString() {
		return "User";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is called");
	}
}
