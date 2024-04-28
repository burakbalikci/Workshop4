package q1;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        // Employee operations
        EmployeeManager employeeManager = new EmployeeManager();

        List<Employee> employees = employeeManager.getAll();

        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getFirstname() + " " + employee.getLastname() + ", Department: " + employee.getDepartment());
        }

        System.out.println("--------------------------------------");

        // Add a new employee
        Employee newEmployee = new Employee(4, "Alice", "Johnson", "alice.johnson@example.com", "password789", "IT");
        employeeManager.add(newEmployee);
        System.out.println("\nNew Employee Added:");
        System.out.println("ID: " + newEmployee.getId() + ", Name: " + newEmployee.getFirstname() + " " + newEmployee.getLastname()+ ", Department: " + newEmployee.getDepartment() );

        // Update an employee
        Employee updatedEmployee = new Employee(1, "Bob", "Wilson", "bob.wilson@example.com", "password123", "HR");
        employeeManager.update(updatedEmployee);
        System.out.println("\nEmployee Updated:");

        // Delete an employee
        employeeManager.delete(3);
        System.out.println("\nEmployee Deleted:");

        System.out.println("--------------------------------------");
        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getFirstname() + " " + employee.getLastname()+ ", Department: " + employee.getDepartment());
        }
    }
}
