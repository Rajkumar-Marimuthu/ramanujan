package com.rojatech.ramanujan.ch03.java8.methodreference;

public class MethodReferenceDemo1 {

	public void method2(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		MyInterface mi = i -> System.out.println(i);
		mi.myMethod(10);
		
		MethodReferenceDemo1 md = new MethodReferenceDemo1();
		MyInterface mi2 = md::method2;
		mi2.myMethod(20);
	}

}
