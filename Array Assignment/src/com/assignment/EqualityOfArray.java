/*9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22,
32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22]
Here both arrays are equal*/

package com.assignment;

public class EqualityOfArray {

	public static void main(String[] args) {
		int[] arrayOne = { 11, 22, 32, 42, 52, 62 };

		int[] arrayTwo = { 11, 22, 32, 42, 52, 62 };

		boolean equalOrNot = true;

		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}

		if (equalOrNot) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}
	}

}
