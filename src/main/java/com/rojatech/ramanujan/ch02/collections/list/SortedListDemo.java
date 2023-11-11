package com.rojatech.ramanujan.ch02.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("Z");
		list.add("N");
		list.add("S");
		list.add("G");
		
		Collections.sort(list);
		System.out.println(list);
		
		int result = Collections.binarySearch(list, "S");
		System.out.println(result);
	}

}
