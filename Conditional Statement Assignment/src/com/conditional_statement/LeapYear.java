//1. Write a Java program to check whether a year is leap year or not 

package com.conditional_statement;

import java.util.Scanner;

class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = sc.nextInt();

		if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
		sc.close();
	}
}
