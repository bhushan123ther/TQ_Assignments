package com.addArraylistassignment;

import java.util.ArrayList;

public class IncreaeArrayListSize {

	public static void main(String[] args) {
		// Create an ArrayList of integers with an initial capacity of 5
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);

		// Add some numbers to the ArrayList
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		// Increase the capacity of the ArrayList to 10
		numbers.ensureCapacity(10);

		// Add some more numbers to the ArrayList
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);

		// Print the ArrayList
		System.out.println(numbers);

	}

}
