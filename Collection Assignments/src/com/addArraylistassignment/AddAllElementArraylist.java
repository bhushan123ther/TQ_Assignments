package com.addArraylistassignment;

import java.util.ArrayList;

public class AddAllElementArraylist {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		ArrayList<Integer> newlist = new ArrayList<>();
		newlist.addAll(list);
		newlist.add(50);
		newlist.add(60);

		System.out.println(newlist);

	}

}
