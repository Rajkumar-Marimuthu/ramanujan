package com.rojatech.ramanujan.ch01.datatypes.arrays;

import java.util.Arrays;

public class ArraysBinarySearchDemo {

	public static void main(String[] args) {
		 String[] a = {"V", "A", "Z", "P"};
		    int res = Arrays.binarySearch(a,"Z");
		    System.out.println(res);
	}

}
