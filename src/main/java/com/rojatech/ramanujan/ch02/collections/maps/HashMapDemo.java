package com.rojatech.ramanujan.ch02.collections.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.rojatech.ramanujan.ch02.collections.sorting.Employee;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 70);
		map.put("Tom", 60);
		map.put("Virat", 100);
		map.put("Sachin", 99);
		
		Set<String> keySet = map.keySet();
		System.out.println("keys: " + keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("values: " + values);
		
		for ( String key : keySet) {
			System.out.println("Key: " + key + " value: " + map.get(key));	
		}
	}

}
