package com.loop_assignment;

public class PrimeNumBtn {
	public static void main(String[] args) {
		for (int no = 300; no <= 400; no++) {
			int temp = 0;
			for (int i = 2; i <= no - 1; i++) {
				if (no % i == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				System.out.println(no);
			}
		}
	}
}
