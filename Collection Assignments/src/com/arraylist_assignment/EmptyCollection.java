// 20. WAP to check if collection is empty

package com.arraylist_assignment;

import java.util.ArrayList;

public class EmptyCollection {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();

		if (colors.isEmpty()) {
			System.out.println("The collection is empty.");
		} else {
			System.out.println("The collection is not empty.");
		}
	}
}
