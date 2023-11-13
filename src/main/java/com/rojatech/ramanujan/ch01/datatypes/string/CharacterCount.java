package com.rojatech.ramanujan.ch01.datatypes.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "Hello how are you";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		int i=0;
		while (i<str.length()) {
			Character c = str.charAt(i);
			if ( map.get(c) == null ) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+1);
			}
			i++;
		}
		System.out.println(map);
	}

}
