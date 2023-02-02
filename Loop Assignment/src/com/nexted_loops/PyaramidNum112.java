package com.nexted_loops;

public class PyaramidNum112 {
	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i < 8; i++) {
			for (j = 8; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(" " + k);
			}
			System.out.println();
		}
	}
}
