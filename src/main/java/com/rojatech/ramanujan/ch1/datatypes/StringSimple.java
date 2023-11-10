package com.rojatech.ramanujan.ch1.datatypes;

import java.util.Arrays;
import java.util.Scanner;

public class StringSimple {

	public void springSplitSamples() {
		String str = "my name is rajkumar";
		String substr = str.substring(3);
		String substr1 = str.substring(11,14);
		String[] splitted = str.split(" ");
		Arrays.stream(splitted).forEach(System.out::println);
		System.out.println(substr);
		System.out.println(substr1);

	}
	public static void main (String[] args) {
		StringSimple ss = new StringSimple();
		ss.springSplitSamples();
		char[] vowels = {'a','e','i','o','u'};
		String vow = new String(vowels);
		System.out.println(vow);
		
		byte[] ba = {65,66,67};
		String abc = new String(ba);
		System.out.println(abc);
		
		String str1 = new String("Enter the sentences to split");
		System.out.println(str1);
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine(); 
		String[] strarr = s.trim().split("[ !,?._'@]+", 0);
		if (s.length() > 0)
			System.out.println(strarr.length);
		else 
			System.out.println(0);
		if (s.length() >=1 && s.length()<=400000) {
			//Arrays.stream(strarr).forEach(System.out::println);
			for (String str : strarr) {
				System.out.println(str);
			}
		} 
		scan.close();
	}
}
