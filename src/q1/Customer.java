package q1;

public class Customer extends User {
    private String phoneNumber;
    private String address;

    public Customer(Integer id) {
        super(id);
    }

    public Customer(Integer id, String firstname, String lastname, String email, String password, String phoneNumber, String address) {
        super(id, firstname, lastname, email, password);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}