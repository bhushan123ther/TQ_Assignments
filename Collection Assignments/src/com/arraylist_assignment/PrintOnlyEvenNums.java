//18. WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)

package com.arraylist_assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintOnlyEvenNums {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			nums.add(i);
		}

		Iterator<Integer> iterator = nums.iterator();
		while (iterator.hasNext()) {
			int num = iterator.next();
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
}
