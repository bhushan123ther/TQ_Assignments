package com.addArraylistassignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(60);
		list.add(50);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

	}

}
