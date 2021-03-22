package com.app.emp.services;

import com.app.emp.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer createCustomer(Customer customer);

    Customer getCustomerById(String id);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(String id);
}
