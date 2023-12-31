package com.rojatech.ramanujan.ch09.others;
import java.util.Scanner;

public class DataTypeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >=-128 && x <=127) System.out.println("* byte");
				if (x >=-32768 && x <=32767) System.out.println("* short");
				if (x >=-2147483647 && x <= 2147483646) System.out.println("* int");
				if (x >= -9223372036854775807L && x <= 9223372036854775806L) System.out.println("* long");
			} catch (Exception e) {
				System.out.println(sc.next()+ " can't be fitted anywhere.");
			}
			
		}

	}

}
