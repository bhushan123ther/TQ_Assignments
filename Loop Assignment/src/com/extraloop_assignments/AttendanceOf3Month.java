package com.extraloop_assignments;

import java.util.Scanner;

public class AttendanceOf3Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter attendance of january month : ");
		int x = sc.nextInt();

		System.out.println("Enter attendance of february month : ");
		int y = sc.nextInt();

		System.out.println("Enter attendance of march month : ");
		int z = sc.nextInt();

		float sum = x + y + z;

		int total_classes = 90; // total number of classes

		float attend;

		attend = ((sum / total_classes) * 100);

		if ((attend >= 75) && (attend <= 100)) {
			System.out.println("ALLOW TO GIVE EXAM:" + attend + "%");
		} else if (attend >= 60 && attend <= 75) {
			System.out.println(" WARNING TO GIVE MOCK EXAM  :" + attend + "%");
		} else if (attend < 60) {
			System.out.println(" YOU ARE NOT ELIGIBLE:" + attend + "%");
		} else {
			System.out.println("ERROR!!INVALID INPUT");
			sc.close();
		}
	}
}
