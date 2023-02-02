package com.conditional_statement;

import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month [Jan,Feb,March,April,May,June,July,Aug,Sep,Auct,Nov,Dec]: ");
		String month = sc.nextLine();

		if (month.equals("Jan") || month.equals("March") || month.equals("May") || month.equals("July")
				|| month.equals("Aug") || month.equals("Auct") || month.equals("Dec")) {
			System.out.println(month + " 31 days are present in this month");
		} else if (month.equals("Feb")) {
			System.out.println(month + " 28 days are present in this month");
		} else if (month.equals("April") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
			System.out.println(month + " 30 days are present in this month");
		} else {
			System.out.println("Please enter correct month");
		}
		sc.close();
	}
}
