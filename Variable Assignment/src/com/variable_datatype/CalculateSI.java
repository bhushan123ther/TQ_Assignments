//16. Write a Java program to enter P, T, R and calculate Simple Interest.

package com.variable_datatype;

public class CalculateSI {
	public static void main(String[] args) {
		long principle_amt = 10000;
		long time = 5;
		long rate = 5;

		long Simple_Interest = (principle_amt * time * rate) / 100;
		System.out.println("Simple Interest is : " + Simple_Interest);
	}
}
