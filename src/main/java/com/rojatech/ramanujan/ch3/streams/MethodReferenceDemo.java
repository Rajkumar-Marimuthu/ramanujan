// we have defined a functional interface FunctionalInterfaceDemo and 
//referring a static method to it's functional method singleAbstractMethod().
package com.rojatech.ramanujan.ch3.streams;

public class MethodReferenceDemo {
	
	public static void main (String[] args) {
		FunctionalInterfaceDemo fid = Test :: testImplementation2;
		fid.singleAbstractMethod();	
	}
}

class Test {
	public static void testImplementation() {
		System.out.println("This is test implementation of abstract method");
	}
	
	public static void testImplementation2() {
		System.out.println("This is test implementation of abstract method2");
	}
	
}