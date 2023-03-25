package com.arraylist_assignment;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConvertCollectionInToArr {

	public static void main(String[] args) {
		Collection<Integer> collection = new ConcurrentLinkedQueue();

		for (int i = 1; i <= 10; i++) {
			collection.add(i);
		}
		Integer[] arr = new Integer[5];

		Integer[] arr2 = collection.toArray(arr);

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i] + " ");
			}
		}

	}

}
