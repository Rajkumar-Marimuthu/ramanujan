package com.rojatech.ramanujan.ch2.collections;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Ram");
		ll.add("Kumar");
		ll.addFirst("Mr.");
		ll.addLast("B.E");
		
		ll.forEach(v->System.out.println(v));

	}

}
