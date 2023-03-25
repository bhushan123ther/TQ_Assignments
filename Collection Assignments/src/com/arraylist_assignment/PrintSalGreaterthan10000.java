package com.arraylist_assignment;

import java.util.ArrayList;

class Employee1 {
	int id;
	String name;
	double sal;

	public Employee1(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return "Employee [ Id : " + id + " , Name : " + name + " , Salary : " + sal + " ]";
	}
}

public class PrintSalGreaterthan10000 {

	public static void main(String[] args) {
		ArrayList<Employee1> arrayList = new ArrayList<>();

		Employee1 emp1 = new Employee1(101, "Ranvir", 20000);
		Employee1 emp2 = new Employee1(102, "Dipika", 10000);
		Employee1 emp3 = new Employee1(103, "Bhushan", 50000);
		Employee1 emp4 = new Employee1(104, "Anil", 9000);

		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.add(emp3);
		arrayList.add(emp4);

		for (Employee1 emp : arrayList) {
			if (emp.sal > 10000) {
				System.out.println(emp);
			}
		}
	}
}
