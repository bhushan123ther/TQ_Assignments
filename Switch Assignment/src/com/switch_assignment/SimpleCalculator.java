package com.switch_assignment;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();

		float sum, sub, mul, div;

		System.out.println("Enter symbol : [+,-,*,/] : ");
		String symbol = sc.next();

		switch (symbol) {
		case "+":
			sum = num1 + num2;
			System.out.println("Sum of two number is : " + sum);
			break;

		case "-":
			sub = num1 - num2;
			System.out.println("Substraction of two number is : " + sub);
			break;

		case "*":
			mul = num1 * num2;
			System.out.println("Multiplication of two number is : " + mul);
			break;

		case "/":
			div = num1 / num2;
			System.out.println("Division of two number is : " + div);
			break;

		default:
			System.out.println("Wrong input...");
		}
	}
}
