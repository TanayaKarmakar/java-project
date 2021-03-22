package com.app.emp.services.impl;

import com.app.emp.domain.Customer;
import com.app.emp.exception.EntityNotFoundException;
import com.app.emp.exception.ErrorKeyCodes;
import com.app.emp.repositories.CustomerRepository;
import com.app.emp.services.CustomerService;
import com.azure.cosmos.models.PartitionKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        Iterator<Customer> custItr = customerRepository.findAll().iterator();
        List<Customer> customers = new ArrayList<>();

        while(custItr.hasNext()) {
            customers.add(custItr.next());
        }

        return customers;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(ErrorKeyCodes.NOT_FOUND));
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    @Override
    public void deleteCustomer(String id) {
        Customer customer = getCustomerById(id);
        customerRepository.deleteById(id, new PartitionKey(customer.getCity()));
    }
}
