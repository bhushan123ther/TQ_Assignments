/*12. WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78,
54, 34, 10, 0, 34] */

package com.assignment;

public class Replace0with1 {

	public static void main(String[] args) {

		int array[] = { 26, 0, 54, 34, 10, 0, 34 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = 1;
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
