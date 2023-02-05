package com.assignment;

class Doctor {
	void hospitalName() {
		System.out.println("The name of hospital is JK hospital");
	}
}

class Nurse extends Doctor {
	void dresingColor() {
		System.out.println("Nurses and doctor have white color dress");
	}
}

class Patient extends Nurse {
	void department() {
		System.out.println("Patient staying at general department");
	}
}

public class TestMultiLevel {
	public static void main(String[] args) {

		Patient p1 = new Patient();
		p1.hospitalName();
		p1.department();
		p1.dresingColor();
	}

}
