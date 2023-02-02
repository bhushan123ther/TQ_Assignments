package com.operator_assignmnets;

public class Output3 {

	public static void main(String[] args) {
		int i = 10;
		int n = i++ % 5;

		System.out.println(i); // 11
		System.out.println(n); // 0

		i++;
		System.out.println(i);
		++i;
		System.out.println(i);

		double ans = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(ans);

		double ans2 = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
		System.out.println(ans2);
	}

}
