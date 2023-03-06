/*19. WAP to print the employees from Employee[] array who has same salary (Create
Employee class which has 3 attributes id, name, salary and add employee objects to
your array) */

package com.assignment;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(1, "John", 50000), new Employee(2, "Jane", 60000),
				new Employee(3, "David", 50000), new Employee(4, "Mary", 55000), new Employee(5, "Tom", 55000) };

		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].salary == employees[j].salary) {
					System.out.println(employees[i].name + " and " + employees[j].name + " have the same salary: "
							+ employees[i].salary);
				}
			}
		}
	}

}
