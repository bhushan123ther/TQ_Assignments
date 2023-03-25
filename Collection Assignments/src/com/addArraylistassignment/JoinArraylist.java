package com.addArraylistassignment;

import java.util.ArrayList;
import java.util.List;

public class JoinArraylist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Sham");
		list.add("Shita");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Sanika");
		list2.add("Gita");
		list2.add("Neha");

		List<String> joinList = new ArrayList<String>(list);
		joinList.addAll(list2);

		System.out.println(joinList);

	}
}
