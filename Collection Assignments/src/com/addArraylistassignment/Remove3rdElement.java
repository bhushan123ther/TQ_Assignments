package com.addArraylistassignment;

import java.util.ArrayList;

public class Remove3rdElement {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Durian");
		fruits.add("Orange");
		fruits.add("Kivi");

		fruits.remove(2);

		System.out.println(fruits);

	}

}
