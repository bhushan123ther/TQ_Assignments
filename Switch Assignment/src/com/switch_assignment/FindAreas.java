package com.switch_assignment;

import java.util.Scanner;

public class FindAreas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter symbol : area_circle \n area_sqr \n area_rat \n area_rect \n circum_circle \n peri_sqr : ");
		System.out.println("------------------------------------------");
		String exp = sc.next();

		double area_rect, area_sqr, area_circle, area_rat, circum_circle, peri_sqr;

		switch (exp) {
		case "area_rect":
			System.out.println("Enter length of rectangle : ");
			float l = sc.nextFloat();

			System.out.println("Enter width of rectangle : ");
			float w = sc.nextFloat();

			area_rect = l * w;

			System.out.println("Area of rectangle : " + area_rect);
			break;

		case "area_sqr":
			System.out.println("Enter side of squre : ");
			float side = sc.nextFloat();

			area_sqr = side * side;

			System.out.println("Area of squre : " + area_sqr);
			break;

		case "area_circle":
			System.out.println("Enter radius of circle : ");
			float radius = sc.nextFloat();

			area_circle = 3.14 * radius * radius;

			System.out.println("Area of circle : " + area_circle);
			break;

		case "area_rat":
			System.out.println("Enter height of rigth angle triangle : ");
			float height = sc.nextFloat();

			System.out.println("Enter base of right angle triangle  : ");
			float base = sc.nextFloat();

			area_rat = (height * base) / 2;

			System.out.println("Area of right angle triangle is : " + area_rat);
			break;

		case "circum_circle":
			System.out.println("Enter radius of circle : ");
			float r = sc.nextFloat();

			circum_circle = 2 * 3.14 * r;

			System.out.println("Circumference of circle is : " + circum_circle);
			break;

		case "peri_sqr":
			System.out.println("Enter side of squre : ");
			float sd = sc.nextFloat();

			peri_sqr = 4 * sd;

			System.out.println("Perimeter of square is : " + peri_sqr);
			break;

		default:
			System.out.println("Wrong input...");
		}
	}
}
