/*13. WAP to replace all negative value with its immediate left elements square. Means
arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9]
Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49]. */

package com.assignment;

public class ReplaceElemLeftSq {

	static void replace(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = arr[i - 1] * arr[i - 1];
			}
		}
	}

	static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 3, -19, 29, 5, -61, 44, 7, -9 };

		replace(arr);
		printArr(arr);

	}

}
