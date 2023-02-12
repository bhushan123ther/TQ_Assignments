//14. WAP to check if an array of integers contains two specified elements 65 and 77. 

package com.assignment;

public class CheckElementContain {

	public static void main(String[] args) {
		int arr[] = { 10, 30, 40, 65, 20, 50, 60, 77 };
		int element1 = 65;
		int element2 = 77;

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element1) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] == element2) {
						temp++;
					}
				}
			}
		}

		if (temp > 0) {
			System.out.println("Contain element");
		} else {
			System.out.println("Not contain element");
		}

	}

}
