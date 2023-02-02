package com.loop_assignment;

import java.util.Scanner;

public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find it's digits product : ");
		int no = sc.nextInt();

		int prod = 1;

		while (no != 0) {
			int rem = no % 10;
			prod *= rem;
			no = no / 10;
		}
		System.out.println("The product of digits is : " + prod);
	}
}
