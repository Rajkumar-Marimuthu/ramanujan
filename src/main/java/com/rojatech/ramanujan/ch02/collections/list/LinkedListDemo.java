package com.rojatech.ramanujan.ch02.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> ll = new LinkedList<>();
		ll.add("Chennai");
		ll.add("Newyork");
		ll.add("Paris");
		ll.add("London");
		
		System.out.println("Before removal list : " + ll); // [Chennai, Newyork, Paris, London]
		
		// This remove code will throw java.util.ConcurrentModificationException
		/* for (String string : ll) {
			if (string.equals("Chennai")) {
				ll.remove("Chennai");
			}
		} */
		
		// removal using iterator will work fine.
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			String city = it.next();
			if (city.equals("Chennai")) {
				it.remove();
			}
		}
		System.out.println("after removal list : " + ll); // [Newyork, Paris, London]	
	}
}
 