package com.rojatech.ramanujan.ch03.java8.predicates;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate<String> pred = s -> s.length()>=5;
		System.out.println("String length greather than 5 : " + pred.test("hell"));

	}

}
