package com.rojatech.ramanujan.ch2.collections.list;

public class MyComparator implements java.util.Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
