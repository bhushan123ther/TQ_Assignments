package com.operator_assignmnets;

public class Output4 {
	public static void main(String s[]) {
		int a = 34;
		double d = 20.5;

		d += a;
		a += d;
		d -= a;
		a -= d;

		System.out.println(" d = " + ++d);
		System.out.println(" a = " + a--);

	}

}
