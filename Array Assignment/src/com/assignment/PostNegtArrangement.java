/*15. WAP to arrange the elements of an given array of integers where all negative
integers appear before all the positive integers. */

package com.assignment;

public class PostNegtArrangement {

	static void rearrange(int arr[], int n) {
		int j = 0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };

		int n = arr.length;

		rearrange(arr, n);
		printArray(arr);
	}

}
