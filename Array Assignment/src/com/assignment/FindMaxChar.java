/*18. WAP to find max character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’,
‘R’], so min character is ‘A’. */

package com.assignment;

public class FindMaxChar {

	public static void main(String[] args) {
		int arr[] = { 'A', 'D', 'E', 'x', 'R', 'Z', 'p' };

		char maxChar = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxChar) {
				maxChar = (char) arr[i];
			}
		}
		System.out.println("Max character in character array is : " + maxChar);
	}

}
