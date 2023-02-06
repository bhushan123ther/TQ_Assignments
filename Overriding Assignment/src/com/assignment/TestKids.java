/*1) WAP to create a class Kid with method readBook() and another method readBook () with 2
parameters. The method readBook here is over-loaded (same method name but different
parameters) Create a class BigKid which extends Kid created above. Implement readBook() differently in
BigKid class. Here the method readBook() has been over-ridden in the child class BigKid()
*/

package com.assignment;

class Kid {
	void readBook(int bookId, String bookName) {
		System.out.println("Kid reading book : \n" + "Book Id : " + bookId + "\n Book Name : " + bookName);
	}
}

class BigKid extends Kid {
	void readBook(int bookId, String bookName) {
		System.out.println("Big kid reading book : \n" + "Book Id : " + bookId + "\nBook Name : " + bookName);
	}
}

public class TestKids {

	public static void main(String[] args) {

		BigKid bk = new BigKid();
		bk.readBook(101, "Java");

	}

}
