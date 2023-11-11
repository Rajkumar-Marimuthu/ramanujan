package com.rojatech.ramanujan.ch02.collections.list;

public class MyComparator implements java.util.Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
