package com.setAssignment;

import java.util.TreeSet;

public class GetStrictlyLessNum {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);

		int element = 35;

		Integer strictlylessElement = nums.lower(element);

		System.out.println("The strictly less than element of " + element + " is " + strictlylessElement);
	}

}
