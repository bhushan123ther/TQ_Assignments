package com.coursemanagementcurd;

import java.util.Scanner;

public class CourseManager {

	private static final int MAX_COURSES = 5;
	private static Course[] courses = new Course[MAX_COURSES];
	private static int numCourses = 0;

//======================================================================== main() method ===================================================================
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println(
				"=================================== Welcome to our Institute ============================================");
		do {
			System.out.println("********** Please select Proper Option : **************");
			System.out.println("1. Add course");
			System.out.println("2. Delete course");
			System.out.println("3. Update course");
			System.out.println("4. Display all courses");
			System.out.println("5. Display course by ID");
			System.out.println("0. Exit");
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			System.out.print("Enter choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // consume newline character

			switch (choice) {
			case 1:
				addCourse(scanner);
				break;
			case 2:
				deleteCourse(scanner);
				break;
			case 3:
				updateCourse(scanner);
				break;
			case 4:
				displayAllCourses();
				break;
			case 5:
				displayCourseById(scanner);
				break;
			case 0:
				System.out.println("Thank you for visiting...");
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}
			System.out.println("Do you want to perform more operations [Yes - 1 ||  No - 0]");
			choice = scanner.nextInt();
			if (choice == 0) {
				System.out.println("Thank you ");
			}
		} while (choice == 1);

		scanner.close();
	}

//=========================================== Add Course section ======================================================================================
	private static void addCourse(Scanner scanner) {
		if (numCourses == MAX_COURSES) {
			System.out.println("Maximum number of courses reached!");
			return;
		}

		System.out.print("Enter course ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // consume newline character

		System.out.print("Enter course name: ");
		String name = scanner.nextLine();

		System.out.print("Enter course fees: ");
		double fees = scanner.nextDouble();
		scanner.nextLine(); // consume newline character

		Course course = new Course(id, name, fees);
		courses[numCourses++] = course;

	}

//=========================================== Delete Course section ======================================================================================
	private static void deleteCourse(Scanner scanner) {
		System.out.print("Enter course ID to delete: ");
		int id = scanner.nextInt();
		// scanner.nextLine(); // consume newline character

		int index = findCourseIndexById(id);
		if (index == -1) {
			System.out.println("Course not found!");
		} else {
			for (int i = index; i < numCourses - 1; i++) {
				courses[i] = courses[i + 1];
			}
			numCourses--;
			System.out.println("Course deleted.");
		}
	}

//============================================= Update Course section ====================================================================================
	private static void updateCourse(Scanner scanner) {
		System.out.print("Enter course ID to update: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // consume newline character

		int index = findCourseIndexById(id);
		if (index == -1) {
			System.out.println("Course not found!");
		} else {
			System.out.println("Enter new course name (leave blank to keep current name): ");
			String name = scanner.nextLine();

			if (!name.equals("")) {
				courses[index].setName(name);
			}

			System.out.println("Enter new course fees (enter 0 to keep current fees): ");
			double fees = scanner.nextDouble();
			scanner.nextLine(); // consume newline character

			if (fees != 0) {
				courses[index].setFees(fees);
			}

			System.out.println("Course updated.");
		}
	}

//=============================================== Display all courses section ==================================================================================
	private static void displayAllCourses() {
		for (int i = 0; i < numCourses; i++) {
			System.out.println(courses[i]);
		}
	}

//================================================ Display course by id section =================================================================================   
	private static void displayCourseById(Scanner scanner) {
		System.out.print("Enter course ID to display: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // consume newline character

		int index = findCourseIndexById(id);
		if (index == -1) {
			System.out.println("Course not found!");
		} else {
			System.out.println(courses[index]);
		}
	}

//================================================== Find course Index by Id section ===============================================================================

	private static int findCourseIndexById(int id) {
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}
}
