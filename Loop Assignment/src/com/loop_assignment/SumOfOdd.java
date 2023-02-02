package com.loop_assignment;

import java.util.Scanner;

public class SumOfOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to calculate sum of all odd number till given number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0)
				sum += i;
		}
		System.out.println(sum);
	}
}
