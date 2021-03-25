package com.app.emp.mappers;

import com.app.emp.bo.Customer;
import com.app.emp.common.response.CustomerResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerBOResponseMapper {
    Customer responseToBo(CustomerResponse customerResponse);

    CustomerResponse boToResponse(Customer customer);
}
