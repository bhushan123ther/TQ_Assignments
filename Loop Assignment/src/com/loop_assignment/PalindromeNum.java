package com.loop_assignment;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		int temp = num;
		int rev = 0;

		while (temp != 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		if (num == rev) {
			System.out.println(num + " is palindrome number.");
		} else {
			System.out.println(num + " is not palindrome number.");
		}
	}

}
