package com.assignment;

public class DisplayAllSq {

	public static void main(String[] args) {

		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };

		for (int num : arr) {
			if (Math.sqrt(num) % 1 == 0) {
				System.out.println(num + " ");
			}
		}

	}
}
