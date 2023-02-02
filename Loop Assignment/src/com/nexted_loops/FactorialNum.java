// s=1!+2!+3!.........+n! find s

package com.nexted_loops;

public class FactorialNum {
	public static void main(String[] args) {
		int n = 5;
		int j = 1, fact = 1, sum = 0;
		for (int i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				fact = fact * j;
			}
			sum += fact;
			fact = 1;
		}
		System.out.println(sum);
	}

}
