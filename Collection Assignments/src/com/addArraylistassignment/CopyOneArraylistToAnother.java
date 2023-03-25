package com.addArraylistassignment;

import java.util.ArrayList;

public class CopyOneArraylistToAnother {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(60);
		list.add(50);
		list.add(20);
		list.add(30);
		list.add(40);

		ArrayList<Integer> newlist = new ArrayList<>(list);

		System.out.println(newlist);

	}

}
