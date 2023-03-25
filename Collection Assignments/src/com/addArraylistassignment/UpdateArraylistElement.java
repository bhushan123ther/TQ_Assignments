package com.addArraylistassignment;

import java.util.ArrayList;

public class UpdateArraylistElement {

	public static void main(String[] args) {
		// Create ArrayList of strings
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Durian");

		// Print the original ArrayList
		System.out.println("Original ArrayList: " + fruits);

		// Update the element at index 2
		fruits.set(2, "Grape");

		// Print the updated ArrayList
		System.out.println("Updated ArrayList: " + fruits);

	}

}
