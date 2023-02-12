//2. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23]

package com.assignment;

public class FindSecondMin {
	static void findSecondMin(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The second min value of an array is : " + arr[1]);
	}

	public static void main(String[] args) {

		int array[] = { -20, 0, -25, 15, 19, 37, 23 };
		findSecondMin(array);
	}

}
