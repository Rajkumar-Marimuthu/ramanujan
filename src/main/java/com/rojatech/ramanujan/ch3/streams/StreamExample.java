package com.rojatech.ramanujan.ch3.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		String[] names = {"Pichai", "Elon", "Mike", "Amit", "Mary", "Laila", "Sairam"};
		List<String> nameList = new ArrayList<>(Arrays.asList(names));
		//List<String> nameList = Arrays.asList(names);
		
		// Create stream based on array
		Arrays.stream(names).forEach(name -> System.out.println(name));
		Optional<String> min = Arrays.stream(names).min((a,b) -> a.compareTo(b));
		System.out.println(min);
		
		// Create stream based on list
		Stream<String> listStream = nameList.stream();
		boolean res = nameList.stream().allMatch(name -> !name.isEmpty());
		System.out.println(res);
		
		// Create stream using generate method
		Stream<Integer> generatedStream = Stream.generate(()->5);
		
		// create stream using iterate method
		Stream<Integer> iteratedStream = Stream.iterate(1,x-> x+5);
		
		List<Integer> intList = Arrays.asList(4,3,7,4,2,1,9);		
		System.out.println("Sum = " + intList.stream().reduce(0, (a,b)-> a+b));
		
		// flatMap
		String[][] names2d = {names, names};
		String[] names1d = Stream.of(names2d)
				.flatMap(arr -> Stream.of(arr))
				.peek(n -> System.out.println("peek " + n))
				.toArray(size -> new String[size]);
		
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
