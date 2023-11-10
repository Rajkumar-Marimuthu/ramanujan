package com.rojatech.ramanujan.ch2.collections.maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new IdentityHashMap<>();
		map.put(new Integer(100), "Raj");
		map.put(new Integer(100), "Kumar");

		System.out.println(map);

	}

}
