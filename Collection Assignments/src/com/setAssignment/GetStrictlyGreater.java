package com.setAssignment;

import java.util.TreeSet;

public class GetStrictlyGreater {

	public static void main(String[] args) {

		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);

		int element = 30;

		Integer strictlyGreaterNum = nums.higher(element);

		System.out.println("The element in the TreeSet strictly greater than or equal to " + element + " is "
				+ strictlyGreaterNum);
	}

}
