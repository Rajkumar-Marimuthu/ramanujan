package com.rojatech.ramanujan.ch10.algorithm;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		//Input: n=7 , 
		int[] arr = {1, 2, 3, 6, 3, 6, 1};
		int alen = arr.length;
		//Output: 1, 3, 6
		//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer> origSet = new HashSet<Integer>();
		Set<Integer> dupSet = new HashSet<Integer>();

		for (int i=0;i<alen;i++) {
			if (origSet.contains(arr[i])) {
				dupSet.add(arr[i]);
			} else {
				origSet.add(arr[i]);
			}
		}
		System.out.println(dupSet);

	}

}
