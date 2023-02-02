package com.loop_assignment;

import java.util.Scanner;

public class CountNumDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;

		while (temp != 0) {
			temp /= 10;
			count++;
		}
		System.out.println(count + " digits are present in the " + num);
	}

}
