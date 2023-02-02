package com.constructor_assignment;

/*11). Create Academy class with appropriate attributes (instance variable) and create getter & setter */

public class Academy {
	private int roll_no;
	private String headOfAcad;
	private String acad_name;

	public void setRoll_num(int roll_no) {
		this.roll_no = roll_no;
	}

	public int getRoll_num() {
		return roll_no;
	}

	public void setHeadOfAcad(String headOfAcad) {
		this.headOfAcad = headOfAcad;
	}

	public String getHeadOFAcad() {
		return headOfAcad;
	}

	public void setName(String name) {
		this.acad_name = name;
	}

	public String getName() {
		return acad_name;
	}
}
