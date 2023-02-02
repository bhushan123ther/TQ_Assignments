package com.switch_assignment;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month : ");
		String month = sc.next();

		switch (month) {
		case "Jan":
		case "March":
		case "May":
		case "July":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.println("31 days");
			break;
		case "April":
		case "June":
		case "Sep":
		case "Nov":
			System.out.println("30 days");
			break;
		case "Feb":
			System.out.println("28 days");
			break;
		default:
			System.out.println("Wrong choice");
		}
	}

}
