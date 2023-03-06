/*20. Accept number from user and add table of number in array and display */

package com.assignment;

import java.util.Scanner;

public class Number_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to add table : ");
		int number = sc.nextInt();

		int[] table = new int[10];

		for (int i = 0; i < table.length; i++) {
			table[i] = number * (i + 1);
		}

		System.out.println("The table of " + number + " is : ");

		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + " ");
		}
	}
}
