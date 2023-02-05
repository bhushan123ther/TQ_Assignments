package com.assignment;

class Principle {
	void vacation() {
		System.out.println("Vacation...");
	}
}

class HeadMaster extends Principle {
	void presentyRecord() {
		System.out.println("Presenty record");
	}
}

class Master extends HeadMaster {
	void studentData() {
		System.out.println("Student data");
	}
}

public class TestMulInhe2 {

	public static void main(String[] args) {
		Master m1 = new Master();
		m1.vacation();
		m1.presentyRecord();
		m1.studentData();
	}
}
