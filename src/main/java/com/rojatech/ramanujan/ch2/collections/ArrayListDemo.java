package com.rojatech.ramanujan.ch2.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(5,23,21); // Ordered collection
		System.out.println(intList); // [5, 23, 21]

		// ArrayList of Integer
		List<Integer> values1 = new ArrayList<>();	
		values1.add(3);
		values1.add(10);
		values1.add(8);
		values1.add(1, 5);
		System.out.println(values1); // [3, 5, 10, 8]

		// Sort ArrayList
		Collections.sort(values1);
		System.out.println(values1); // [3, 5, 8, 10]

		// ArrayList of String
		List<String> words = Arrays.asList("Hello", "how", "are");
		System.out.println(words); // [Hello, how, are]

		// LinkedList
		words = new LinkedList<String>(words);
		words.add("you?");
		System.out.println(words); // [Hello, how, are, you?]

		// Collections.sort()
		Collections.sort(words);
		System.out.println(words); // [Hello, are, how, you?]

		// ArrayList of Object
		List<Object> values = new ArrayList<Object>();
		values.add(3);
		values.add("Naveen");
		System.out.println(values); // [3, Naveen]








	}
}
