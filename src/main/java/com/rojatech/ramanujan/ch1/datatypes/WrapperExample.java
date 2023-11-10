package com.rojatech.ramanujan.ch1.datatypes;

public class WrapperExample {

	public static void main(String[] args) {
		
		int x = 10;
		Integer xi = Integer.valueOf(x);
		System.out.println(xi);
		
		int y = xi.intValue();
		System.out.println(y);
		
		String str = Integer.toString(x);
		System.out.println(str);
		int z = Integer.parseInt(str);
		System.out.println(z);
		Integer si = Integer.valueOf(str);
		System.out.println(si);
		
		//int c = Integer.parseInt("C");
		//System.out.println(c);
		
		long l = 1000;
		Long ll = new Long(l);
	}

}
