package com.loop_assignment;

import java.util.Scanner;

public class FindFrequencyOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		int temp = num;

		System.out.println("Enter number to find frequency : ");
		int freq = sc.nextInt();

		int count = 0;

		while (temp != 0) {
			if (temp % 10 == freq)
				count++;
			temp = temp / 10;
		}
		System.out.println("In this " + num + " frequency of " + freq + " is : " + count);
	}
}
