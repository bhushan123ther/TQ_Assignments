package com.operator_assignmnets;

public class IncDec {
	public static void main(String s[]) {

		int a = 1;
		int b = 2;
		int c;
		int d;

		c = ++b;
		d = a++;

		c++;

		System.out.println("a = " + a); // a = 2
		System.out.println("b = " + b); // b = 3
		System.out.println("c = " + c); // c = 4
		System.out.println("d = " + d); // d = 1
	}

}
