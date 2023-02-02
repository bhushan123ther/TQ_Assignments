package com.operator_assignmnets;

public class Output6 {
	public static void main(String s[]) {
		int i = 4;
		int j = 21;

		int k = ++i * 7 + 2 - j--;

		System.out.println("k = " + k);

		System.out.println("---------------------------");

		int a = 1;
		a = a++ + ++a * --a - a--;
		System.out.println(" a : " + a);

		System.out.println("----------------------------");
		int m = 1010, n = 1010;
		System.out.println(m++ / ++n * n-- / --m);

		System.out.println("----------------------------");

		int x = 001, y = 010, z = 100;

		int l = --x + y++ - z-- - --z + ++y - --x + y-- - --x;

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		System.out.println("i=" + l);
	}
}
