package com.extraloop_assignments;

import java.util.Scanner;

public class BonasProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee salary : ");
		long sal = sc.nextLong();

		System.out.println("Enter year of experience : ");
		int exp = sc.nextInt();

		if (exp >= 5) {
			System.out.println("Bonus in salary = " + (sal + (sal * 0.2)));
		} else if (exp >= 3) {
			System.out.println("Bonus in salary = " + (sal + (sal * 0.1)));
		} else if (exp >= 1) {
			System.out.println("Bonus in salary = " + (sal + (sal * 0.05)));
		} else {
			System.out.println("Bonus in salary = " + (sal + 110));
		}
	}

}
