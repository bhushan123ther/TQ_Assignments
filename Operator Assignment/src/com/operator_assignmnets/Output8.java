package com.operator_assignmnets;

public class Output8 {
	public static void main(String[] args) {
		int i = 0, j = 0;

		System.out.println(--i * i++ * ++j * j++); // 1

		int a = 1, b = 2;

		System.out.println(--b - ++a + ++b - --a);

		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;

		System.out.println("p : " + p);

	}

}
