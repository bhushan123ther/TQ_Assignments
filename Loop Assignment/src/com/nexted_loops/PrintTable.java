package com.nexted_loops;

public class PrintTable {
	public static void main(String args[]) {
		int i = 1, j = 1;
		System.out.println("Tables");

		while (i <= 2) // change to 2 to 10 or 20 as many tables user want
		{
			while (j <= 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
			i++;
			j = 1;
			System.out.println("");
		}
	}
}
