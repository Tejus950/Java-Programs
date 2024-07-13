package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EmployeeDatabase {

	    private Map<Integer, String> employees = new HashMap<>();
	    private Scanner scanner = new Scanner(System.in);

	    public void addEmployee(int id, String name) {
	        if (employees.containsKey(id)) {
	            System.out.println("Employee with ID " + id + " already exists.");
	        } else {
	            employees.put(id, name);
	            System.out.println("Employee added successfully: ID = " + id + ", Name = " + name);
	        }
	    }

	    public void updateEmployee(int id, String newName) {
	        if (employees.containsKey(id)) {
	            employees.put(id, newName);
	            System.out.println("Employee with ID " + id + " updated successfully. New Name = " + newName);
	        } else {
	            System.out.println("Employee with ID " + id + " not found.");
	        }
	    }

	    public void deleteEmployee(int id) {
	        if (employees.containsKey(id)) {
	            String name = employees.remove(id);
	            System.out.println("Employee with ID " + id + " (" + name + ") deleted successfully.");
	        } else {
	            System.out.println("Employee with ID " + id + " not found.");
	        }
	    }

	    public void displayAllEmployees() {
	        System.out.println("\nEmployee Database:");
	        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {
	        EmployeeDatabase database = new EmployeeDatabase();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nEmployee Database Management System:");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Update Employee");
	            System.out.println("3. Delete Employee");
	            System.out.println("4. Display All Employees");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character after reading int

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter employee ID: ");
	                    int id1 = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline character after reading int
	                    System.out.print("Enter employee name: ");
	                    String name1 = scanner.nextLine();
	                    database.addEmployee(id1, name1);
	                    break;
	                case 2:
	                    System.out.print("Enter employee ID to update: ");
	                    int id2 = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline character after reading int
	                    System.out.print("Enter new name: ");
	                    String name2 = scanner.nextLine();
	                    database.updateEmployee(id2, name2);
	                    break;
	                case 3:
	                    System.out.print("Enter employee ID to delete: ");
	                    int id3 = scanner.nextInt();
	                    database.deleteEmployee(id3);
	                    break;
	                case 4:
	                    database.displayAllEmployees();
	                    break;
	                case 5:
	                    System.out.println("Exiting the program...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }

	        } while (choice != 5);

	        scanner.close();
	    }
	}

	
