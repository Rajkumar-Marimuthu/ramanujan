package com.rojatech.ramanujan.ch3.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {

		String[] names = {"Pichai", "Elon", "Mike", "Amit", "Mary", "Laila", "Sairam"};
		List<String> nameList = new ArrayList<>(Arrays.asList(names));
		//List<String> nameList = Arrays.asList(names);
		
		for (String name: names) {
			if (name.startsWith("A") || name.startsWith("B")) {
				nameList.add(name);
			}
		}
		System.out.println(nameList);
		
		for (int i=0; i<names.length;i++) {
			if (!names[i].equals("Mike")) {
				names[i] += " student";
			}
			System.out.println(names[i]);
		}
		
		List<String> newNameList = new ArrayList<>(Arrays.asList(names));
		
		for (String name: newNameList) {
			if (name.equals("Mike")) {
				newNameList.remove(name);
			}
		}
		System.out.println(newNameList);
	}

}
