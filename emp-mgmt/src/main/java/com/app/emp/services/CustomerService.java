package com.app.emp.services;

import com.app.emp.bo.Customer;
import com.app.emp.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {
    List<CustomerEntity> getAllCustomers();

    //Customer createCustomer(Customer customer);

    CustomerEntity getCustomerById(String id);

    CustomerEntity updateCustomer(CustomerEntity customer);

    void deleteCustomer(String id);
}
