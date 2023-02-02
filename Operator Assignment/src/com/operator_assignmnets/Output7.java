package com.operator_assignmnets;

public class Output7 {
	public static void main(String[] args) {
		int a = 34;
		int b = 21;
		int c = a++ + ++b;
		int d = --a + --b + c--;
		int e = a + +b + +c + d--;
		int f = -a + b-- + -c - d++;
		int sum = a + b + c + d + e + f;
		System.out.println("sum = " + sum);

		int i = 0, j = 0;
		System.out.println(--i * i++ * ++j * j++);
	}
}
