package com.rojatech.ramanujan.challenges.array;

public class LargestSumOfContagiousSubarray {

	public static void main(String[] args) {
		// Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. 
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		
		int sum = maxSubArraySum(arr);
		System.out.println(sum);
	}

	private static int maxSubArraySum(int[] arr) {
		int len = arr.length;
		int sum_at = 0;
		int max_sum = 0;
		
		for (int i=0; i<len;i++) {
			sum_at = sum_at + arr[i];
			if (max_sum < sum_at ) {
				max_sum = sum_at;
			}
			if (sum_at <0) {
				sum_at = 0;
			}
		}
		
		return max_sum;
	}

}
