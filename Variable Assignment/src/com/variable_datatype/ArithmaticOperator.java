//2. Write a Java program to enter two numbers and perform all arithmetic operations.

package com.variable_datatype;

import java.util.Scanner;

public class ArithmaticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();

		System.out.println("Addition of two number is : " + (num1 + num2));
		System.out.println("Substraction of two number is : " + (num1 - num2));
		System.out.println("Multiplication of two number is : " + (num1 * num2));
		System.out.println("Division of two number is : " + (num1 / num2));
	}

}
