package com.app.emp.controller;

import com.app.emp.bo.Customer;
import com.app.emp.common.request.CustomerRequest;
import com.app.emp.common.request.ServiceRequest;
import com.app.emp.common.response.CustomerResponse;
import com.app.emp.common.response.ServiceResponse;
import com.app.emp.entity.CustomerEntity;
import com.app.emp.mappers.CustomerBOResponseMapper;
import com.app.emp.mappers.CustomerRequestBOMapper;
import com.app.emp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRequestBOMapper customerRequestBOMapper;

    @Autowired
    private CustomerBOResponseMapper customerBOResponseMapper;

    @GetMapping
    public ServiceResponse<List<CustomerResponse>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        ServiceResponse<List<CustomerResponse>> serviceResponse = new ServiceResponse<>();
        serviceResponse.setStatus(HttpStatus.OK);
        serviceResponse.setResponsePayload(customerBOResponseMapper.boToResponseList(customers));
        return serviceResponse;
    }

    @PostMapping
    public ServiceResponse<CustomerResponse> createCustomer(@RequestBody ServiceRequest<CustomerRequest> serviceRequest) {
        CustomerRequest customerRequest = serviceRequest.getPayload();
        Customer customer = customerService.createCustomer(customerRequestBOMapper.dtoToBo(customerRequest));
        ServiceResponse<CustomerResponse> serviceResponse = new ServiceResponse<>();
        serviceResponse.setStatus(HttpStatus.CREATED);
        serviceResponse.setResponsePayload(customerBOResponseMapper.boToResponse(customer));

        return serviceResponse;
    }

    @GetMapping("/{id}")
    public CustomerEntity getCustomerById(@PathVariable String id) {
        return customerService.getCustomerById(id);
    }

    //snapshot update
    @PutMapping
    public ServiceResponse<CustomerResponse> updateCustomer(@RequestBody ServiceRequest<CustomerRequest> serviceRequest) {
        CustomerRequest customerRequest = serviceRequest.getPayload();
        Customer customer = customerService.updateCustomer(customerRequestBOMapper.dtoToBo(customerRequest));
        ServiceResponse<CustomerResponse> serviceResponse = new ServiceResponse<>();
        serviceResponse.setStatus(HttpStatus.OK);
        serviceResponse.setResponsePayload(customerBOResponseMapper.boToResponse(customer));

        return serviceResponse;
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
        return id;
    }
}
