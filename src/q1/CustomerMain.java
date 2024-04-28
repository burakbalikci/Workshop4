package q1;

import java.util.List;
public class CustomerMain {
    public static void main(String[] args) {
        // Customer operations
        CustomerManager customerManager = new CustomerManager();

        List<Customer> customers = customerManager.getAll();

        System.out.println("All Customers:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getFirstname() + " " + customer.getLastname());
        }

        System.out.println("--------------------------------------");

        // Add a new customer
        Customer newCustomer = new Customer(4, "John", "Doe", "john.doe@example.com", "password123", "123456789", "123 Main St");
        customerManager.add(newCustomer);
        System.out.println("\nNew Customer Added:");
        System.out.println("ID: " + newCustomer.getId() + ", Name: " + newCustomer.getFirstname() + " " + newCustomer.getLastname());

        // Update a customer
        Customer updatedCustomer = new Customer(1, "Jane", "Smith", "jane.smith@example.com", "password456", "987654321", "456 Oak St");
        customerManager.update(updatedCustomer);
        System.out.println("\nCustomer Updated:");

        // Delete a customer
        customerManager.delete(3);
        System.out.println("\nCustomer Deleted:");

        System.out.println("--------------------------------------");
        System.out.println("All Customers:");
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getFirstname() + " " + customer.getLastname());
        }
    }
}
