package com.rojatech.ramanujan.ch3.streams;
import java.util.function.Predicate;

public class PredicateJoiningDemo {

	public static void main(String[] args) {
		Predicate<String> checkLength = s -> s.length() >= 5;
		Predicate<String> checkLengthEven = s -> s.length() % 2 == 0;
		System.out.println(checkLength.test("rajkumarm"));
		System.out.println(checkLengthEven.test("rajkumarm"));
		System.out.println(checkLength.or(checkLengthEven).test("rajkumarm"));
		System.out.println(checkLength.negate().test("rajkumar"));

	}

}
