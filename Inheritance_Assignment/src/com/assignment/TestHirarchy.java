package com.assignment;

class University {
	void result() {
		System.out.println("Result");
	}
}

class College extends University {
	void clgRecord() {
		System.out.println("College Record..");
	}
}

class PhysicalCollege extends University {
	void gameEvent() {
		System.out.println("Games are shedule");
	}
}

public class TestHirarchy {

	public static void main(String[] args) {
		PhysicalCollege phyclg1 = new PhysicalCollege();
		phyclg1.result();

	}

}
