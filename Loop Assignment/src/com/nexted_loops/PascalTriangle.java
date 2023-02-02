package com.nexted_loops;

public class PascalTriangle {

	public static void main(String[] args) {
		int num;
		for (int i = 0; i < 5; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			}
			num = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
