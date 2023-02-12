//1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90] 

package com.assignment;

public class FindSecondMax {

	static void findSecondMax(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The second max value of an array is : " + arr[1]);
	}

	public static void main(String[] args) {

		int arr[] = { 20, 0, 31, 45, 100, 1, 105, 90 };
		findSecondMax(arr);
	}

}
