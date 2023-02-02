package com.nexted_loops;

public class PyaramidNum {
	public static void main(String[] args) {
		int i, j, k;
		int n = 9;
		k = 1;
		for (i = 1; i < 8; i++) {
			for (j = 8; j >= i; j--) {
				System.out.print(" "); // space print
			}
			for (j = 1; j <= i; j++) {
				System.out.print(" " + i); // number print
			}
			System.out.println();
			k++;
		}
	}
}
