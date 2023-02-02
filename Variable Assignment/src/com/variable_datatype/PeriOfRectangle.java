//3. Write a Java program to enter length and breadth of a rectangle and find its perimeter

package com.variable_datatype;

import java.util.Scanner;

public class PeriOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle : ");
		float length = sc.nextFloat();

		System.out.println("Enter breadth of rectangle : ");
		float breadth = sc.nextFloat();

		double perimeter = 2 * (length + breadth);
		System.out.println("The perimeter of rectangle is : " + perimeter);
	}
}
