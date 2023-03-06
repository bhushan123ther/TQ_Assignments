/*17. WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’,
‘R’], so min character is ‘A’. */

package com.assignment;

public class FindMinChar {

	public static void main(String[] args) {
		char[] arr = { 'A', 'D', 'E', 'x', 'z', 'R' };

		char minchar = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minchar) {
				minchar = arr[i];
			}
		}
		System.out.println("The minimum character in the array is : " + minchar);
	}

}
