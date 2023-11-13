package com.rojatech.ramanujan.ch01.datatypes.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateRemoval {

	public static void main(String[] args) {
		String str = "hello how are you";
		List<Character> list = new ArrayList<Character>();
		for(int i=0;i<str.length();i++) {
			if (!list.contains(str.charAt(i))) {
				list.add(str.charAt(i));
			}
		}
		System.out.println(list);
		String result = "";
		for (Character character : list) {
			result += character;
		}
		System.out.println(result);
	}

}
