package com.rojatech.ramanujan.ch01.datatypes;

public class CommandLineSample {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No arguments given.");
		} else {
			for (int i=0;i<args.length;i++) {
				System.out.println(args[i]);
			}
		}
	}

}
