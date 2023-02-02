package com.extraloop_assignments;

import java.util.Scanner;

public class BillingProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();

		System.out.println("Enter your product name : ");
		String item_name = sc.next();

		System.out.println("Enter quntity : ");
		int quantity = sc.nextInt();

		System.out.println("Enter price : ");
		double price = sc.nextInt();

		System.out.println("Enter your product name : ");
		String item_name2 = sc.next();

		System.out.println("Enter quntity : ");
		int quantity2 = sc.nextInt();

		System.out.println("Enter price : ");
		double price2 = sc.nextInt();

		System.out.println("Enter your product name : ");
		String item_name3 = sc.next();

		System.out.println("Enter quntity : ");
		int quantity3 = sc.nextInt();

		System.out.println("Enter price : ");
		double price3 = sc.nextInt();

		double total_bill = price * quantity;
		double total_bill2 = price2 * quantity2;
		double total_bill3 = price3 * quantity3;
		double overall_total = total_bill + total_bill2 + total_bill3;

		double disc = 0;
		double payable_amt;

		if (overall_total > 3000) {
			disc = (20 * total_bill) / 100;
		} else if (total_bill > 2000) {
			disc = (15 * total_bill) / 100;
		} else if (total_bill > 1000) {
			disc = (10 * total_bill) / 100;
		} else {
			disc = (5 * total_bill) / 100;
		}
		System.out.println("=======================Thank you for shopping===============================");
		System.out.println("Your name : " + name);
		System.out.println("Total Bill : " + total_bill);
		System.out.println("Discount : " + disc);
		System.out.println("Amount Payable : " + (total_bill - disc));
	}
}
