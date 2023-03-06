/*21. WAP to display all square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12,
9, 78, 66, 39, 0] so output is 25, 49, 9. */

package com.assignment;

public class DisplayAllSqr {

	public static void main(String[] args) {
		int arr[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };

		for (int i : arr) {
			if (Math.sqrt(i) % 1 == 0) {
				System.out.println(i);
			}
		}
	}

}
