package com.operator_assignmnets;

public class Output9 {
	public static void main(String[] args) {
		int i = 11;

		i = i++ + ++i;

		System.out.println(i); // 24

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		System.out.println("----------------------------");

		int j = 0;

		j = j++ - --j + ++j - j--;

		System.out.println("j : " + j); // 0

		System.out.println("----------------------------");

		int m = 1, n = 2, k = 3;

		int l = m-- - n-- - k--;

		System.out.println("m = " + m);
		System.out.println("n = " + n);
		System.out.println("k = " + k);
		System.out.println("l = " + l);

	}

}
