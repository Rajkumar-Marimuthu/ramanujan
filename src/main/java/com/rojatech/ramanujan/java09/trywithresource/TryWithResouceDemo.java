package com.rojatech.ramanujan.java09.trywithresource;

public class TryWithResouceDemo {

	public static void main(String[] args) {
		MyWorker myWorker = new MyWorker();
		
		try(myWorker) {
			myWorker.doSomething();
		} catch(Exception e) {
			
		}
	}

}
