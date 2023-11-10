package com.rojatech.ramanujan.ch3.java8.streams;
import java.util.ArrayList;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(53);
		arrList.add(23);
		arrList.add(25);
		
		arrList.stream().map(i->i*i).forEach(i->System.out.println(i));
		

	}

}
