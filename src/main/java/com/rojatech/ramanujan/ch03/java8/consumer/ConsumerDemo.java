package com.rojatech.ramanujan.ch03.java8.consumer;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> squareMe = i -> System.out.println(i*i);
		Consumer<Integer> doubleIt = i -> System.out.println(i*2);
		squareMe.andThen(doubleIt).accept(5);
	}
}
