//15. Write a Java program to enter marks of five subjects and calculate total, average and percentage.

package com.variable_datatype;

public class Marksheet {
	public static void main(String[] args) {
		int math = 56, eng = 87, mart = 88, hin = 77, sci = 90;
		double total = math + eng + mart + hin + sci;
		double average = total / 5;
		double percentage = (total / 500) * 100;

		System.out.println("Total of five subjects : " + total);
		System.out.println("Average of five subjects : " + average);
		System.out.println("Percentage of five subjects : " + percentage);
	}
}
