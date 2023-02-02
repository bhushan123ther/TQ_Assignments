//8. Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)

package com.variable_datatype;

import java.util.Scanner;

public class TempConvertFtoC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tempereture in Fahrenheit : ");
		double pahr = sc.nextDouble();
		double celsius = (pahr - 32) / 1.8;
		System.out.println("The temperature in Celsius : " + celsius);
	}
}
