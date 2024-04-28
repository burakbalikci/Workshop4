package q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class CustomerManager {
    private List<Customer> customers;


    public CustomerManager() {
        this.customers = new ArrayList<>();
        Customer customer = new Customer(1,"Esat","Yener","esat@esat.com","1234","5551231212","Ankara");
        Customer customer2 = new Customer(2,"Burak","Balikci","burak@burak.com","12345","5551231212","Sakarya");
        customers.add(customer);
        customers.add(customer2);
    }

    // Add a new customer
    public void add(Customer customer) {
        customers.add(customer);
    }

    // Delete a customer by ID
    public void delete(int id) {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    // Update a customer
    public void update(Customer updatedCustomer) {
        for (Customer customer : customers) {
            if (customer.getId() == updatedCustomer.getId()) {
                customer.setFirstname(updatedCustomer.getFirstname());
                customer.setLastname(updatedCustomer.getLastname());
                customer.setEmail(updatedCustomer.getEmail());
                customer.setPassword(updatedCustomer.getPassword());
                customer.setPhoneNumber(updatedCustomer.getPhoneNumber());
                customer.setAddress(updatedCustomer.getAddress());
                return;
            }
        }
    }

    // Get all customers
    public List<Customer> getAll() {
        return customers;
    }

    // Get customer by ID
    public Customer getById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}