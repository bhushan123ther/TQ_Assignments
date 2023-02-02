package com.loop_assignment;

public class Even_NumDowhile {
	public static void main(String[] args) {
		int i = 121;
		System.out.println("Even numbers are : ");
		do {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		} while (i <= 299);
	}
}
