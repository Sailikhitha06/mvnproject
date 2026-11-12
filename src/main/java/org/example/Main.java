package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String id;
    String name;
    String department;

    public Student(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Department: " + department;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Student Management System ===");

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number (1-3): ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();

                    students.add(new Student(id, name, dept));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\n--- Student Directory ---");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 3.");
            }
        } while (choice != 3);

        scanner.close();
    }
}