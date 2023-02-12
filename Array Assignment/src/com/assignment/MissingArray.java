/*10. Write a Java program to find a missing number in an array. Means e.g. array has 1
to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is
5 */

/*
 * sum of n sequential number will be [n*(n+1)/2]
 * 1. Find sum of all numbers in an array
 * 2. Run loop till (n-1) and find sum of (n-1).
 * 3. MissingNum = sumOfAll - sumOfArray
 * */

package com.assignment;

public class MissingArray {

	static void findmissingNum(int arr[]) {
		// SumOfAll = n*(n+1)/2

		int n = arr.length; // length of array

		int sumOfAll = ((n) * (n + 1)) / 2; // sum of whole array

		int sumOfArray = 0;

		for (int i = 0; i < n - 1; i++) // loop till (n-1)
		{
			sumOfArray += arr[i]; // sum of (n-1)array
		}

		int missingNum = sumOfAll - sumOfArray;
		System.out.println("Missing number in an array is : " + missingNum);
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6, 7 };

		findmissingNum(arr);
	}

}
