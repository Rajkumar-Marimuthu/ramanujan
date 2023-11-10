package com.rojatech.ramanujan.ch1.datatypes;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hellow, how are you?");
		System.out.println(sb.capacity());
		sb.append("when you are coming back to office?");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("abcde");
		System.out.println(sb1.reverse());
	}

}
