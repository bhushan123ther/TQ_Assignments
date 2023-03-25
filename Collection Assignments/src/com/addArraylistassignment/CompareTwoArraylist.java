package com.addArraylistassignment;

import java.util.ArrayList;

public class CompareTwoArraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Sham");
		list.add("Shita");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Ram");
		list2.add("Gita");
		list2.add("Shita");

		if (list.equals(list2)) {
			System.out.println("Both list are same");
		} else {
			System.out.println("Both list are different.");
		}

	}

}
