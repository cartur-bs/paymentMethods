package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import employees.Employee;
import employees.Outsourced_employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();
        
	try {
		System.out.println("Enter the number of employees: ");
		int employeesAmount = sc.nextInt();

		for (int i = 0; i < employeesAmount; i++) {
			System.out.println("Is the employee outsourced? (Y/N)");
			char Outsourced = sc.next().charAt(0);
			System.out.println("Type employee #" + (i + 1) + " data ");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Worked hours: ");
			double workedHours = sc.nextDouble();
			System.out.print("Salary per hour: ");
			double amountPerHour = sc.nextDouble();
			if (Outsourced == 'N') {
				Employee employeeObj = new Employee(name, workedHours, amountPerHour);
				employeeList.add(employeeObj);
			} else {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee employeeObj = new Outsourced_employee(name, workedHours, amountPerHour, additionalCharge);
				employeeList.add(employeeObj);
			}
		}

		System.out.println("PAYMENTS: ");
		for (Employee obj : employeeList) {
			System.out.println("Name: " + obj.getName());
			System.out.println("Salary: " + obj.Salary());
			
		}
	
		sc.close();
	}
	catch(InputMismatchException e) {
		System.out.println("Error: Please, enter a valid value.");
	}
		
	}

}
