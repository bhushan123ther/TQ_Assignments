package com.assignment;

public class ArrayDescendingOrder {

	public static void main(String[] args) {

		int arr[] = { 11, 45, 32, 44, 10, 22, 55, 10 };

		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
