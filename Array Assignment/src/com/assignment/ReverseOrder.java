package com.assignment;

public class ReverseOrder {

	static void reverOrder(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
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

		System.out.println("Reveres Array : ");
		reverOrder(arr);

	}

}
