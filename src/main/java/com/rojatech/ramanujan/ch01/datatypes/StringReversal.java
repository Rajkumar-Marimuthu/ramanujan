package com.rojatech.ramanujan.ch01.datatypes;

public class StringReversal {

	String reverse (String str) {
		String reversed = "";
		for(int i=str.length(); i>0; i--) {
			reversed += str.charAt(i-1);
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		
		String myStr = "myname";
		StringReversal reversal = new StringReversal();
		System.out.println(reversal.reverse(myStr));
	}
}
