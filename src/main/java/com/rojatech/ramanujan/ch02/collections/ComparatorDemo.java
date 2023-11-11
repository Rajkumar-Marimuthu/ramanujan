package com.rojatech.ramanujan.ch02.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		
		values.add(345);
		values.add(104);
		values.add(836);
		values.add(1, 533);
		
		System.out.println(values);
		
		Collections.sort(values, new ComparatorImpl());
	}

}
