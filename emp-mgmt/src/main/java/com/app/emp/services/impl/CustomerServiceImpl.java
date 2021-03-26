package com.app.emp.services.impl;

import com.app.emp.bo.Customer;
import com.app.emp.entity.CustomerEntity;
import com.app.emp.exception.EntityNotFoundException;
import com.app.emp.exception.ErrorKeyCodes;
import com.app.emp.mappers.CustomerBOEntityMapper;
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

    @Autowired
    private CustomerBOEntityMapper customerBOEntityMapper;

    @Override
    public List<Customer> getAllCustomers() {
        Iterator<CustomerEntity> custItr = customerRepository.findAll().iterator();
        List<Customer> customers = new ArrayList<>();

        while(custItr.hasNext()) {
            customers.add(customerBOEntityMapper.entityToBo(custItr.next()));
        }

        return customers;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        CustomerEntity customerEntity = customerBOEntityMapper.boToEntity(customer);
        customerEntity.setId(UUID.randomUUID().toString());
        customerRepository.save(customerEntity);

        return customerBOEntityMapper.entityToBo(customerEntity);
    }


    @Override
    public CustomerEntity getCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(ErrorKeyCodes.NOT_FOUND));
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        CustomerEntity customerEntity = customerBOEntityMapper.boToEntity(customer);
        customerRepository.save(customerEntity);
        return customerBOEntityMapper.entityToBo(customerEntity);
    }


    @Override
    public void deleteCustomer(String id) {
        CustomerEntity customer = getCustomerById(id);
        customerRepository.deleteById(id, new PartitionKey(customer.getCity()));
    }
}
