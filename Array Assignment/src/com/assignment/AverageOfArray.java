/*11. WAP to calculate average of all elements in an Array except max and min element
(Means don’t include the highest and lowest number of your array in your average). */

package com.assignment;

public class AverageOfArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };

		int max = arr[0];
		int min = arr[0];

		float sum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}

		float average = ((sum - max - min)) / (arr.length - 2);
		System.out.println("The average of all elements in an array except max and min element is : " + average);
	}

}
