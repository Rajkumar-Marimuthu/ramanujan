package com.rojatech.ramanujan.ch1.datatypes;

public class LoopTest {

	public static void main(String[] args) {
		int n = 150;

		for (int i=1; i<=n; i++) {
			if (i==100)
				break;
			if (i%10 == 0)
				continue;
			System.out.println(i);
		}
		
		int i = 1; 
		while (i<=n) { 
			if (i==100) break;
			if (i%10 != 0) 
				System.out.println(i); 
			i++; 
		}

		int j = 1; do { 
			if (j==100) break;
			if (j%10 != 0)  
				System.out.println(j); 
			j++; } 
		while (j<=n);

	}
}
