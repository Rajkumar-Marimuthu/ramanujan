package com.rojatech.ramanujan.ch3.streams;
import java.util.function.Function;


public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> squareMe = i -> i*i;
		System.out.println(squareMe.apply(5));

	}

}
