package q1;

public class Employee extends User {
    private String department;

    public Employee(Integer id) {
        super(id);
    }

    public Employee(Integer id, String firstname, String lastname, String email, String password, String department) {
        super(id, firstname, lastname, email, password);
        this.department = department;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}