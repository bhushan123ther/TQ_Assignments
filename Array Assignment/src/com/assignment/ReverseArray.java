//3. WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your
//output must be 78, 37, 29, 45, 90, 3 

package com.assignment;

public class ReverseArray {
	static void reverseArray(int arr[]) {
		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[j++] = arr[i];
		}

		printArr(temp);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
	}

	static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 3, 90, 45, 29, 37, 78 };

		System.out.println("Normal Array : ");
		printArr(arr);

		System.out.println();

		System.out.println();

		System.out.println("Reverse Array : ");
		reverseArray(arr);
	}

}
