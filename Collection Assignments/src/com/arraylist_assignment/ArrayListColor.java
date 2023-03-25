//WAP to create a new ArrayList, add some colors (string) and print the collection.

package com.arraylist_assignment;

import java.util.ArrayList;

public class ArrayListColor {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Yello");
		colors.add("White");
		colors.add("Blue");

		System.out.println("Collection of colors : ");

		for (String color : colors) {
			System.out.println(color);
		}
	}
}
