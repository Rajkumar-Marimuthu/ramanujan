package com.rojatech.ramanujan.ch3.streams;
public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
		AdderImpl adderImpl = new AdderImpl();
		
		String r = adderImpl.add(a->a+"lambda");
		System.out.println(r);

	}

}
