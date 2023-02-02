package com.switch_assignment;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println("Even number");
			break;

		case 1:
			System.out.println("Odd number");
			break;

		default:
			System.out.println("Wrong Input...");
		}
	}
}
