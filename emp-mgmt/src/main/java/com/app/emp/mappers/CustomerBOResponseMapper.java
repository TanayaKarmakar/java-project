package com.app.emp.mappers;

import com.app.emp.bo.Customer;
import com.app.emp.common.response.CustomerResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerBOResponseMapper {
    Customer responseToBo(CustomerResponse customerResponse);

    CustomerResponse boToResponse(Customer customer);

    List<CustomerResponse> boToResponseList(List<Customer> customerList);
}
