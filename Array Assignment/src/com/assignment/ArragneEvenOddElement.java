/*16. WAP to arrange the elements of an given array of integers where all Even integers
appear before all the Odd integers. */

package com.assignment;

public class ArragneEvenOddElement {

	static void evenArrange(int arr[]) {
		int j = 0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}

	static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 3, 2, 4, 6, 5, 7, 8, 9, 10 };

		evenArrange(arr);
		printArr(arr);
	}
}
