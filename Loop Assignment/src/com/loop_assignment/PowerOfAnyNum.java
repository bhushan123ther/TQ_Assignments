package com.loop_assignment;

import java.util.Scanner;

public class PowerOfAnyNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value : ");
		int base = sc.nextInt();

		System.out.println("Enter the power value : ");
		int power = sc.nextInt();

		int temp = power;

		long result = 1;

		while (temp != 0) {
			result = result * base;
			--temp;
		}
		System.out.println("The answer of " + base + " to the power " + power + " is : " + result);

	}

}
