package com.rojatech.ramanujan.ch02.collections;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> lang = new ConcurrentHashMap<Integer, String>();
		
		lang.put(1, "English");
		lang.put(2, "French");
		lang.put(3, "German");
		lang.put(4, "Tamil");
		
		System.out.println(lang);
		

	}

}
