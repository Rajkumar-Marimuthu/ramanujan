package com.rojatech.ramanujan.ch3.streams;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "mango");
		Optional<String> matched = fruits.stream().filter(fruit -> fruit.startsWith("b")).findFirst();
		System.out.println(matched);
		System.out.println(matched.isEmpty());
		System.out.println(matched.isPresent());
		System.out.println(matched.get());
	}

}
