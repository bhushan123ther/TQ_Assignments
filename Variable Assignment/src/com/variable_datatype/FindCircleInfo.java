//5. Write a Java program to enter radius of a circle and find its diameter, circumference and area.

package com.variable_datatype;

import java.util.Scanner;

public class FindCircleInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		float radius = sc.nextFloat();

		float area = 3.14f * (radius * radius);

		System.out.println("Area of circle is : " + area);
		System.out.println("Diameter of circle is :" + (2 * radius));
		System.out.println("Circumference of circle is : " + (2 * 3.14 * radius));
	}
}
