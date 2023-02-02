package com.conditional_statement;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1, num2, sum, sub, mul, div;

		System.out.println("Enter fist number : ");
		num1 = sc.nextFloat();

		System.out.println("Enter second number : ");
		num2 = sc.nextFloat();

		System.out.print("Select symbol to calculate [+,-,*,/] : ");
		char symbol = sc.next().charAt(0);

		if (symbol == '+') {
			sum = num1 + num2;
			System.out.println("Sum of two number is : " + sum);
		} else if (symbol == '-') {
			sub = num1 - num2;
			System.out.println("Substraction of two number is : " + sub);
		} else if (symbol == '*') {
			mul = num1 * num2;
			System.out.println("Multiplication of two number is : " + mul);
		} else if (symbol == '/') {
			div = num1 / num2;
			System.out.println("Division of two number is : " + div);
		} else {
			System.out.println("Enter number only");
		}
		sc.close();
	}

}
