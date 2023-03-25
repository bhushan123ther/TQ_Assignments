package com.arraylist_assignment;

import java.util.ArrayList;

class Empp {
	int id;
	String name;
	int sal;

	public Empp(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return "Employee [ Id = " + id + " , Name = " + name + " , Salary = " + sal + " ]";
	}
}

public class PrintEmpWhoHaveNameSachine {

	public static void main(String[] args) {

		ArrayList<Empp> emppList = new ArrayList<>();
		emppList.add(new Empp(101, "Rupal", 10000));
		emppList.add(new Empp(102, "Sachine", 15000));
		emppList.add(new Empp(103, "Ganesh", 25000));
		emppList.add(new Empp(104, "Dipak", 22000));

		for (Empp emp : emppList) {
			if (emp.name == "Sachine")
				System.out.println(emp);
		}

	}

}
