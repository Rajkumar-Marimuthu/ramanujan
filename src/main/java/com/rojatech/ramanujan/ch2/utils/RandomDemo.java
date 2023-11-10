package com.rojatech.ramanujan.ch2.utils;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random random = new Random();
		System.out.println(random.nextInt());
		
		System.out.println(random.nextInt(100));
	}

}
