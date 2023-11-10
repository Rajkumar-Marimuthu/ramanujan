package com.rojatech.ramanujan.ch1.datatypes;

public class StaticBlock {
	
	static int a = 10;
	
	StaticBlock() { 
		a = 5; 
		System.out.println("constructor, a = " + StaticBlock.a);
	}
	
	{
		System.out.println("not static block a = " + a);
	}

	public static void main(String[] args) {
		System.out.println("in main");
		StaticBlock sb = new StaticBlock();
		System.out.println(sb.a);

	}
	static {
		System.out.println("in static block");
		
	}
}
