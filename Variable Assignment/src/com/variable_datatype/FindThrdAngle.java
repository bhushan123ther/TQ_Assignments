//12. Write a Java program to enter two angles of a triangle and find the third angle

package com.variable_datatype;

import java.util.Scanner;

public class FindThrdAngle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first angle : ");
		int a = sc.nextInt();

		System.out.println("Enter second angle : ");
		int b = sc.nextInt();

		int c = 180 - (a + b);

		System.out.println("Third missing angle is : " + c);
		sc.close();
	}
}
