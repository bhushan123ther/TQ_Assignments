//11. Write a Java program to enter any number and calculate its square root.

package com.variable_datatype;

import java.util.Scanner;

public class CalculateSqureRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find the square root : ");
		double number = sc.nextDouble();

		double sqr = Math.sqrt(number);
		System.out.println("The square root of " + number + " is " + sqr);
		sc.close();
	}
}
