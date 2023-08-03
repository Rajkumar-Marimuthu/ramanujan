package com.rojatech.ramanujan.ch2.collections;
import java.util.HashSet;
import java.util.Set;
// no duplicate elements. 
// no order
public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<String>();
		names.add("Java");
		names.add("Angular");
		names.add("Spring");
		names.add("Hibernate");
		
		names.forEach(v->System.out.println(v));

	}

}
