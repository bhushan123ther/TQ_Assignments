package com.assignment;

class SingleInheritance {
	static int num1 = 10;
	static int num2 = 20;
}

public class MainInheritance extends SingleInheritance {
	public static void main(String[] args) {
		int num3 = 32;
		int result = num1 + num2 + num3;
		System.out.println("Result of child class is : " + result);
	}

}
