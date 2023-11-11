package com.rojatech.ramanujan.ch03.java8.predicates;

import java.util.function.Predicate;

public class PredicateDemo{

	public static void main(String[] args) {
		Predicate<Integer> pr = i -> (i%2==0);	
		System.out.println("Is 10 is even: " + pr.test(10));
		System.out.println("Is 5 is even: " + pr.test(5));
		System.out.println("Is 8 is even: " + pr.test(8));
		System.out.println("Is 7 is even: " + pr.test(7));
		System.out.println("Is 9 is even: " + pr.test(9));
	}
}
