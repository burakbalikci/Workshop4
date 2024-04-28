package q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EmployeeManager {
    private List<Employee> employees;


    public EmployeeManager() {
        this.employees = new ArrayList<>();
        Employee employee = new Employee(1,"Melodi","Bayraktar","melodi@melodi.com","1234","Software");
        Employee employee2 = new Employee(2,"Sevde","Köycü","sevde@sevde.com","12345","Hardware");
        employees.add(employee);
        employees.add(employee2);
    }


    // Add a new employee
    public void add(Employee employee) {
        employees.add(employee);
    }


    // Delete an employee by ID
    public void delete(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }


    // Update an employee
    public void update(Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getId() == updatedEmployee.getId()) {
                employee.setFirstname(updatedEmployee.getFirstname());
                employee.setLastname(updatedEmployee.getLastname());
                employee.setEmail(updatedEmployee.getEmail());
                employee.setPassword(updatedEmployee.getPassword());
                employee.setDepartment(updatedEmployee.getDepartment());
                return;
            }
        }
    }


    // Get all employees
    public List<Employee> getAll() {
        return employees;
    }

    // Get employee by ID
    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
