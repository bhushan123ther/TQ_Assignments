package com.arraylist_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElementsArraylist {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Bhushan");
		names.add("Anand");
		names.add("Ravina");
		names.add("Gita");

		System.out.println("Before swaping ArrayList : ");
		System.out.println(names);

		Collections.swap(names, 1, 3);

		System.out.println("After swapping ArrayList : ");
		System.out.println(names);

	}

}
