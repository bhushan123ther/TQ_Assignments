//21. WAP to convert collection into array

package com.arraylist_assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertCollcetionToArray {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();

		name.add("Bhushan");
		name.add("Ram");
		name.add("Shita");
		name.add("Gita");

		System.out.println(name);

		String arr[] = name.toArray(new String[name.size()]);

		System.out.println(Arrays.toString(arr));
	}

}
