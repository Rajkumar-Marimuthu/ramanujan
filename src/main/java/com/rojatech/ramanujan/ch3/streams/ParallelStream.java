package com.rojatech.ramanujan.ch3.streams;

import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		int total = Stream.of(1,2,3,4,5,6,7,8,9,10)
				.parallel()
				.reduce(1, (x,y) -> x+y);
		System.out.println(total);

	}

}
