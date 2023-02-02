package com.extraloop_assignments;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of five subjects : ");
		float sub1 = sc.nextFloat();
		float sub2 = sc.nextFloat();
		float sub3 = sc.nextFloat();
		float sub4 = sc.nextFloat();
		float sub5 = sc.nextFloat();

		char grade;

		float pert = ((sub1 + sub2 + sub3 + sub4 + sub5) / 500) * 100;

		System.out.println("============= Your Result : ============================");
		if (sub1 == 0 || sub2 == 0 || sub3 == 0 || sub4 == 0 || sub5 == 0) {
			System.out.println("Better luch next time");
		} else {
			if (pert >= 85) {
				grade = 'A';
				System.out.println("Excellent pass with :" + grade);
			} else if (pert >= 70) {
				grade = 'B';
				System.out.println("Very Good pass with :" + grade);
			} else if (pert >= 60) {
				grade = 'C';
				System.out.println("Good pass with :" + grade);
			} else if (pert >= 40) {
				grade = 'D';
				System.out.println("Average pass with :" + grade);
			} else {
				System.out.println("Better luch next time");
			}
		}
	}
}
