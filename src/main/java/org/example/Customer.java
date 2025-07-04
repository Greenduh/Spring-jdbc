package org.example;

public class Customer {
    private int id;
    private String fullName;
    private String email;
    private String socialSecurityNumber;

    public Customer() {}

    public Customer(int id, String fullName, String email, String socialSecurityNumber) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Customer(String fullName, String email, String socialSecurityNumber) {
        this.fullName = fullName;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    public void setSocialSecurityNumber(String socialSecurityNumber) { this.socialSecurityNumber = socialSecurityNumber; }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", ssn='" + socialSecurityNumber + '\'' +
                '}';
    }
}
