package com.rojatech.ramanujan.ch3.streams;
import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}

}
