package com.variable_datatype;

public class AreaOfEquilateralTringle {
	public static void main(String[] args) {
		float side = 7;
		float area;

		area = (float) ((Math.sqrt(3) / 4) * (side * side));

		System.out.println("Area of equilateral triangle is : " + area);
	}
}
