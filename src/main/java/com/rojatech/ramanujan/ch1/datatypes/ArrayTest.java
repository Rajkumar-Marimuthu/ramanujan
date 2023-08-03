package com.rojatech.ramanujan.ch1.datatypes;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		String[] expectedArray = {"one", "two", "three"};
	    String[] resultArray =  {"one", "two", "three"};
	    
		String[] array = new String[5]; // String array initialization
		System.out.println(array); // [Ljava.lang.String;@123a439b
		
		// Print String array
		System.out.println(Arrays.toString(array)); // [null, null, null, null, null]
		
		//Fill array
		Arrays.fill(array, "hello");
		System.out.println(Arrays.toString(array)); // [hello, hello, hello, hello, hello]
		
		// Get array element with index
		System.out.println(array[4]); // hello
		
		// Parse array element
		for (String str: array) {
			System.out.println(str); // hello
		}
		
		//Arrays of dissimilar data types
		Object[] values = new Object[4];
		values[0] = "Navin";
		values[1] = 45;
		
		for (Object obj: values) {
			System.out.println(obj);
		}
		
		// Array declaration
		Integer[] intArray = new Integer[] {4,5,8,2,1,3};
		System.out.println(Arrays.toString(intArray)); // [4, 5, 8, 2, 1, 3]
		
	    
	    
	}
}