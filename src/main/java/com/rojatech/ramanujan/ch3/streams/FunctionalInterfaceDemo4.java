package com.rojatech.ramanujan.ch3.streams;
@FunctionalInterface
interface Any {
	int sum (int x, int y);
}
public class FunctionalInterfaceDemo4 {

	public static void main(String[] args) {
		Any a = (x, y) ->  x + y;
		System.out.println(a.sum(5, 4));
	}

}
