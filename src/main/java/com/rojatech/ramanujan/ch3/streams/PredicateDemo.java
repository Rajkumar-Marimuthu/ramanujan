package com.rojatech.ramanujan.ch3.streams;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> pred = s -> s.length()>=5;
		System.out.println("String length greather than 5 : " + pred.test("hell"));

	}

}
