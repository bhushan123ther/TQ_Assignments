package com.operator_assignmnets;

public class Output2 {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 3;

		System.out.println(a++ + b * ++c); // 21
		System.out.println("a = " + a + " b= " + b + " c = " + c); // a = 6 , b = 4 , c = 4
		System.out.println(b * 5 / a + b++ + b); // 12
		System.out.println("a = " + a + " b= " + b + " c = " + c); // a = 6 , b = 5 , c = 4
	}
}
