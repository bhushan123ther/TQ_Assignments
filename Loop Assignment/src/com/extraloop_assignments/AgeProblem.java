package com.extraloop_assignments;

import java.util.Scanner;

public class AgeProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first person name : ");
		String name1 = sc.next();

		System.out.println("Entere first person age : ");
		int age1 = sc.nextInt();

		System.out.println("Enter second person name : ");
		String name2 = sc.next();

		System.out.println("Enter second person age : ");
		int age2 = sc.nextInt();

		System.out.println("Enter third person name : ");
		String name3 = sc.next();

		System.out.println("Enter thrid person age : ");
		int age3 = sc.nextInt();

		System.out.println("Enter fourth person name : ");
		String name4 = sc.next();

		System.out.println("Enter fourth person age : ");
		int age4 = sc.nextInt();

		if ((age1 > age2) && (age1 > age3) && (age1 > age4)) {
			System.out.println(name1 + " is elder and his age : " + age1);
		} else if ((age2 > age3) && (age2 > age4)) {
			System.out.println(name2 + " is elder and his age : " + age2);
		} else if (age3 > age4) {
			System.out.println(name3 + " is elder and his age : " + age3);
		} else {
			System.out.println(name4 + " is elder and his age : " + age4);
		}
	}
}
