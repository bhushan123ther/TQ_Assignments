//4. Write a Java program to enter length and breadth of a rectangle and find its area.

package com.variable_datatype;

import java.util.Scanner;

public class AreaOfRect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle : ");
		float length = sc.nextFloat();

		System.out.println("Enter breadth of rectangle : ");
		float breadth = sc.nextFloat();

		float area_of_rect = length * breadth;
		System.out.println("The area of rectangle is : " + area_of_rect);
	}
}
