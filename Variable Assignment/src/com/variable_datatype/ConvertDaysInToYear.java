//9. Write a Java program to convert days into years, weeks and days.

package com.variable_datatype;

public class ConvertDaysInToYear {
	public static void main(String[] args) {
		int days = 567;

		// convert days into week
		int weeks = days / 7;
		System.out.println(days + " days means => " + weeks + " weeks");

		// convert days into year
		int years = days / 365;
		System.out.println(days + " days means => " + years + " years");
	}
}
