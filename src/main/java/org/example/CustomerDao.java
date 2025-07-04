package org.example;

import java.util.List;

public interface CustomerDao {
    void addCustomer(Customer customer);
    Customer getCustomerById(int id);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
    List<Customer> getAllCustomers();
}



