package com.rojatech.ramanujan.ch01.datatypes;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		/* 4*2 = 4 Rows 2 Columns
		 	11 12
		 	21 22
		 	31 32
		 	41 42
		 */
		int[][] tab = {
				{11, 12},
				{21, 22},
				{31, 32},
				{41, 42}
		};
		
		int numOfRows = tab.length;
		System.out.printf("num of rows = %s", numOfRows);
		for (int r=0; r<numOfRows; r++) {
			for (int c=0; c<tab[r].length; c++) {
				System.out.println(tab[r][c]);
				
			}
		}
	}
}
