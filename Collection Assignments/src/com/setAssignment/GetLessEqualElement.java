package com.setAssignment;

import java.util.TreeSet;

public class GetLessEqualElement {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);

		int element = 23;

		Integer lessOrEqual = nums.floor(element);

		System.out.println("The number is less than or equal to " + element + " is " + lessOrEqual);

	}

}
