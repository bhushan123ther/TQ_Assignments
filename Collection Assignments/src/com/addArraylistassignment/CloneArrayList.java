package com.addArraylistassignment;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Sham");
		list.add("Shita");

		ArrayList<String> clonelist = (ArrayList<String>) list.clone();

		System.out.println("Original ArrayList : " + list);
		System.out.println("Clone ArrayList : " + clonelist);

	}

}
