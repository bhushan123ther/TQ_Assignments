package com.loop_assignment;

public class EvenNumRange {
	public static void main(String[] args) {
		System.out.println("Even Numbers from 121 to 299 are : ");
		for (int i = 121; i <= 299; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
