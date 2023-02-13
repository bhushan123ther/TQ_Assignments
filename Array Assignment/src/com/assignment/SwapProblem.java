package com.assignment;

public class SwapProblem {

	public static void swapArr(int arr[]) {
		int temp;
		int j = arr.length / 2;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 4, 0, 9 };

		System.out.println("Original array : ");
		printArray(arr);
		System.out.println("");
		swapArr(arr);
		System.out.println("swap array : ");
		printArray(arr);

	}

}
