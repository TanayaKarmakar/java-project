package com.app.emp.services;

import com.app.emp.bo.Customer;
import com.app.emp.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer createCustomer(Customer customer);

    CustomerEntity getCustomerById(String id);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(String id);
}
