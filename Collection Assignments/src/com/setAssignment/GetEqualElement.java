package com.setAssignment;

import java.util.TreeSet;

public class GetEqualElement {

	public static void main(String[] args) {

		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);

		int element = 45;

		Integer greaterOrEqual = nums.ceiling(element);

		System.out.println("The element in the TreeSet greater than or equal to  " + element + " is " + greaterOrEqual);
	}

}
