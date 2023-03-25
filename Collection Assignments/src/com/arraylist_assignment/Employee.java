/*24. WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. Sysout and see both variable
memory space is printed. This is because toString is not overriden but if you would have done this
for Integer then beautiful output would have been printed.
25. Now override toString for earlier assignment and now sysout and see values are printed
26. WAP to print Emp whose salary is > 10000
27. WAP to print Emp who have name "Sachin"
28. WAP to print Emp who have highest number of salary
*/

package com.arraylist_assignment;

import java.util.ArrayList;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public Employee() {

	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Bhushan", 20000);
		Employee emp2 = new Employee(2, "Rahul", 15000);

		ArrayList<Employee> emplist = new ArrayList<Employee>();

		emplist.add(emp1);
		emplist.add(emp2);

		System.out.println(emp1);
		System.out.println(emp2);

		for (Employee emp : emplist) {
			if (emp.getSalary() > 10000) {
				System.out.println(emp);
			}
		}

		System.out.println("=================================================");

		for (Employee emp : emplist) {
			if (emp.getName().equals("Bhushan")) {
				System.out.println(emp);
			}
		}

		System.out.println("==================================================");

		Employee highestSalaryEmp = emplist.get(0);

		for (Employee emp : emplist) {
			if (emp.getSalary() > highestSalaryEmp.getSalary()) {
				highestSalaryEmp = emp;
			}
		}

		System.out.println("Employee with highest salary : " + highestSalaryEmp);
	}

}
