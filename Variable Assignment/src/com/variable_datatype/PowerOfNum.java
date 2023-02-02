//10. Write a Java program to find power of any number x ^ y.

package com.variable_datatype;

import java.util.Scanner;

public class PowerOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value : ");
		int base = sc.nextInt();

		System.out.println("Enter the exponent value : ");
		int exponent = sc.nextInt();

		long result = 1;

		while (exponent != 0) {
			result = result * base;
			--exponent;
		}
		System.out.println("The answer is : " + result);
		sc.close();
	}
}
