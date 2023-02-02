package com.loop_assignment;

public class DisplayFirst10Term3 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int term = 1 + ((i * (i + 1)) / 2);
			System.out.print(term + " ");
		}
	}
}
