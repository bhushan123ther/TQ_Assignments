//6. Write a Java program to enter length in centimeter and convert it into meter and kilometer.

package com.variable_datatype;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		// convert cm to meter
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in centimeter : ");
		double cm = sc.nextDouble();

		double meter = cm / 100.0;
		System.out.println(cm + " cm  means => " + meter + " meter.");

		// convert cm to km
		double kilometer = cm / 100000.0;
		System.out.println(cm + " cm  means => " + kilometer + " kilometer.");
	}

}
