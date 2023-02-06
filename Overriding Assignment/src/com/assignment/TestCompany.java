/*2) WAP to create class company with method address. create class eBay which extends company implement address() differently in eBay class.Here the method address ()has been overridden in child class.*/

package com.assignment;

class Company {
	void address() {
		System.out.println("Address of company..");
	}
}

class EBay extends Company {
	void address() {
		System.out.println("UPI payment taken under EBay Process.");
	}
}

public class TestCompany {
	public static void main(String[] args) {

		EBay obj = new EBay();
		obj.address();

	}

}
