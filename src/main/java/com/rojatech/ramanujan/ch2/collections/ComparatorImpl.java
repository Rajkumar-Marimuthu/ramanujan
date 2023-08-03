package com.rojatech.ramanujan.ch2.collections;
import java.util.Comparator;

public class ComparatorImpl implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if (arg0%100 > arg1%100)
			return 1;
		return -1;
	}

}
